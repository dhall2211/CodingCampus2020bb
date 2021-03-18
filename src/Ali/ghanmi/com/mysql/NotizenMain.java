package Ali.ghanmi.com.mysql;


import java.sql.*;
import java.util.Scanner;

public class NotizenMain {


    private static String url = "jdbc:mysql://localhost:3306/notis";
    private static String user = "root";
    private static String pw = "@Aliben@";

    public static void main(String[] args) {
        while (true) {
            printNote();
            newNoteFromScanner();
        }

    }

    private static void newNoteFromScanner() {
        // create scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new Note");
        String txt = sc.nextLine();

            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, user, pw);
                String insert = "insert into notis(text) Values(\""+txt+"\"";
                Statement statment = connection.createStatement();
                statment.executeUpdate(insert);

            } catch (SQLException e) {
                e.printStackTrace();
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
        // wait for input
        // save input to database (insert into ...)/


    public static void printNote() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            Statement stmt = connection.createStatement();
            ResultSet notis = stmt.executeQuery("Select * from notis");
            while (notis.next()) {
                int id = notis.getInt("id");
                String text = notis.getString("text");
                Date created = notis.getDate("Created");
                System.out.println("note " + id + " " + created.toString() + " " + text);
            }

        } catch (SQLException e) {
            e.printStackTrace();
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
