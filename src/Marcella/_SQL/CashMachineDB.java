package Marcella._SQL;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.*;

public class CashMachineDB {

    private static final String url = "jdbc:mysql://localhost:3306/cashmachine";
    private static final String user = "jdbc user";
    private static final String password = "jdbcuserpassword";

    public static boolean checkIfAccountExists(String accountNumber, String pin) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT accountNumber, pin FROM cashmachine.account WHERE account.accountNumber = ? and account.pin = sha2(?,512);");
            preparedStatement.setString(1, accountNumber);
            preparedStatement.setString(2, pin);
            ResultSet account = preparedStatement.executeQuery();
            return account.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static void showAccountBalance(String accountNumber) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT balance FROM accountbalance WHERE accountbalance.accountNumber = ?");
            preparedStatement.setString(1, accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BigDecimal balance = resultSet.getBigDecimal("balance");
                System.out.println("Actual balance: " + balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void withdrawMoney(String accountNumber) {
        BigDecimal amount = new BigDecimal(CashMachineMain.getScannerInput("What amount do you want to withdraw?"));
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO transaction (transactions, accountNumber) VALUES (-?, ?)");
            preparedStatement.setBigDecimal(1, amount);
            preparedStatement.setString(2, accountNumber);
            preparedStatement.executeUpdate();
            showAccountBalance(accountNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void depositMoney(String accountNumber) {
        BigDecimal amount = new BigDecimal(CashMachineMain.getScannerInput("What amount do you want to deposit?"));
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO transaction (transactions, accountNumber) VALUES (?, ?)");
            preparedStatement.setBigDecimal(1, amount);
            preparedStatement.setString(2, accountNumber);
            preparedStatement.executeUpdate();
            showAccountBalance(accountNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void exportCSV(String accountNumber, String fileName) {
        Connection connection = null;
        Writer writer = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM transaction WHERE transaction.accountNumber = ? ORDER BY date");
            preparedStatement.setString(1, accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            ResultSetMetaData transactionMD = resultSet.getMetaData();
            writer = new FileWriter(fileName);
            // write headings
            int numberOfColumns = transactionMD.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                writer.append(transactionMD.getColumnName(i));
                if (i != numberOfColumns) {
                    writer.append(" | ");
                }
            }
            writer.append("\n");
            // write data
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    writer.append(resultSet.getString(i));
                    if (i != numberOfColumns) {
                        writer.append(" | ");
                    }
                }
                writer.append("\n");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
