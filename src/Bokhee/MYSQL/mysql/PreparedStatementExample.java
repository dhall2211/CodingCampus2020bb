package Bokhee.MYSQL.mysql;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen Kontinent ein:");
        String continent = sc.nextLine();

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mondial?user=gyula&password=gyula");
            PreparedStatement ps = conn.prepareStatement("select Country.Name, round(Population / Area, 2) PopDens " +
                    "from encompasses " +
                    "join country on encompasses.Country = Country.code " +
                    "where encompasses.Continent = ? and Percentage > 50 " +
                    "order by PopDens ASC " +
                    "limit ?;");
            ps.setString(1, continent);
            ps.setInt(2, 12);
            ResultSet rs = ps.executeQuery();

            System.out.printf("%20s %10s%n",
                    "Name",
                    "PopDens");
            System.out.printf("%20s %10s%n",
                    "-".repeat(20),
                    "-".repeat(10));
            while (rs.next()){
                System.out.printf("%20s %10.2f%n",
                        rs.getString("Name"),
                        rs.getFloat("PopDens"));
            }
        } catch (SQLException se){
            se.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException sqle) {}
        }
    }
}
