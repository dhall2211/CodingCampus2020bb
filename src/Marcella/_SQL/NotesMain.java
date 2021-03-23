package Marcella._SQL;

import java.sql.*;
import java.util.Scanner;

public class NotesMain {
    private static final String url = "jdbc:mysql://localhost:3306/notes";
    private static final String user = "jdbc user";
    private static final String password = "jdbcuserpassword";

    private static boolean notesRunning = true;

    public static void main(String[] args) {

        getMetaData();
        int userId = selectUser();
        while(notesRunning) {
            printNotes(userId);
            newNoteFromScanner(userId);
        }
    }

    /**
     * prints all users from database, returns choosen user
     */
    private static int selectUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your userId: ");

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name, userId FROM users ORDER BY users.userID");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int userId = resultSet.getInt("userId");
                System.out.println(name + " " + userId);
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

        int userId = scanner.nextInt();
        return userId;
    }

    /**
     * waits for input (scanner) and saves new note to the database
     */
    private static void newNoteFromScanner(int userId) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your note: ");
        String newNote = scanner.nextLine();

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO notes (text, userId) VALUES (?, ?)");
            preparedStatement.setString(1, newNote);
            preparedStatement.setInt(2, userId);
            preparedStatement.executeUpdate();
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

    /**
     * prints all notes from the database
     */
    private static void printNotes(int userId) {
        System.out.println("These are my notes:");

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT text, created, users.name FROM notes JOIN users ON notes.userId = users.userId WHERE notes.userID = ?");
            preparedStatement.setInt(1, userId);
            ResultSet notes = preparedStatement.executeQuery();
            while (notes.next()) {
                String text = notes.getString("text");
                Date created = notes.getDate("created");
                String usersName = notes.getString("users.name");
                System.out.println("note from " + usersName + " at " + created.toString() + ": " + text);
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

    private static void getMetaData() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet allFromNotes = statement.executeQuery("SELECT * FROM notes");

            ResultSetMetaData allNotesMD = allFromNotes.getMetaData();
            int numberOfColumns = allNotesMD.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %n",
                        allNotesMD.getColumnName(i),
                        allNotesMD.getColumnDisplaySize(i),
                        allNotesMD.getColumnTypeName(i),
                        allNotesMD.getPrecision(i),
                        allNotesMD.isNullable(i)
                        );
            }
            System.out.printf("%-10s %-50s %-20s %-10s %n",
                    "notesId",
                    "text",
                    "created",
                    "userId");
            while (allFromNotes.next()) {
                int notesId = allFromNotes.getInt("notesId");
                String text = allFromNotes.getString("text");
                Date created = allFromNotes.getDate("created");
                int userId = allFromNotes.getInt("userId");
                System.out.printf("%-10s %-50s %-20s %-10s %n",
                        notesId,
                        text,
                        created,
                        userId);
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

}
