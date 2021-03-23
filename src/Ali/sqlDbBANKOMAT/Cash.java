package Ali.sqlDbBANKOMAT;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Cash {
    private static String url = "jdbc:mysql://localhost:3306/atm";
    private static String user = "root";
    private static String pw = "@Aliben@";
    private static String accountNumber;
    private static String pin;

    public static void cash() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acount Number");
        accountNumber = sc.nextLine();
        System.out.println("Enter passWort");
        pin = sc.nextLine();

        isLoginValid(accountNumber, pin);
        auswalMenu();
        saveCsv();

    }

    public static boolean isLoginValid(String accountNumber, String pin) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            var preparedStatement = connection.prepareStatement("select * " +
                    "from account " +
                    "where accountnumber = ? and pin = sha2(?,512)");
            preparedStatement.setString(1, accountNumber);
            preparedStatement.setString(2, pin);
            var resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return false;
    }


    public static int auswalMenu() {
        int auswahl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Operattion Auswahl: \n1.Konto Zustand\n2.Geld Abheben\n3.Geld einzahlen\n4.Log Out\n5.Error");
        auswahl = sc.nextInt();

        if (auswahl == 1) {// 1.konto zustand
            kontoZUstand(accountNumber,pin);
            auswalMenu();
            return 1;

        }
        if (auswahl == 2) {// 2. operation
            abheben();
            auswalMenu();
            return 2;

        }

        if (auswahl == 3) {// 3. operation
        einzahlen();
        auswalMenu();
        return 3;
        }
        if (auswahl == 4) {// 4. Abbruch
            System.out.println("Operation verlassen");
            return 4;

        }
        if (auswahl <= 5) {// type in anything greater than 4 and you will get a
            // system error
            System.out.println("Error");
            auswalMenu();
            return 5;

        }
        return auswahl;

    }


    public static void abheben() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte betrag eingeben:");
        String amount = sc.nextLine();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            var preparedStatement = connection.prepareStatement("insert into transaction(amount,accountNumber)" +
                    " values(?,?)");
            preparedStatement.setString(1, amount);
             preparedStatement.setString(2, accountNumber);
            int rs = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void kontoZUstand(String accountNumber, String pin) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            var preparedStatement = connection.prepareStatement("select sum(amount) " +
                    "from transaction "+
                    "where accountnumber = ?");
            preparedStatement.setString(1, accountNumber);
          //  preparedStatement.setString(2, pin);
            var resultSet = preparedStatement.executeQuery();
            resultSet.next();
            System.out.println("Total balance is: euro: " + resultSet.getDouble(1));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    public static void einzahlen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte betrag eingeben:");
        String amount = sc.nextLine();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            String insert = "insert into transaction (amount,accountNumber) values (\""+amount+"\",\""+accountNumber+"\")";
            Statement statment = connection.createStatement();
            statment.executeUpdate(insert);
            //var preparedStatement = connection.prepareStatement("insert into transaction (?,?)");
           // preparedStatement.setString(1, amount);
           // preparedStatement.setString(2, accountNumber);
            //var resultSet = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    public  static void saveCsv(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            var preparedStatement = connection.prepareStatement("SELECT id, date, amount, accountnumber"+
                    "FROM transaction"+
                    "INTO OUTFILE 'C:/tmp/Selected_Trans.csv' ");
            var resultSet = preparedStatement.executeQuery();
            resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    }
