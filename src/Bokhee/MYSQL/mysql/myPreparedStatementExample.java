package Bokhee.MYSQL.mysql;

import java.sql.*;
import java.util.Scanner;

public class myPreparedStatementExample {
    private static final  String url = "jdbc:mysql://localhost:3306/notes";
    private static final String user = "Accountant"; // root
    private static final String password = "1234567x"; // bokhee72

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen UserName ein : ");
        String userName = sc.nextLine();


        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url + "?user=" + user + "&password=" + password);
            String sql = "select notes.text, users.name from notes " +
                    " join users on users.userid = notes.userid " +
                    "where users.name = ? ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("\"" + rs.getString("text") + "\"");
            }

            conn.close();
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }

/*
        System.out.println("text");
        System.out.println("\"text\"");
*/


    }
}
