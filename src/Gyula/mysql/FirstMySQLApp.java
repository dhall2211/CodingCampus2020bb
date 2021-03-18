package Gyula.mysql;

import java.sql.*;

public class FirstMySQLApp {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mondial?user=gyula&password=gyula");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select Country.Name, round(Population / Area, 2) PopDens " +
                            "from encompasses " +
                            "join country on encompasses.Country = Country.code " +
                            "where encompasses.Continent = 'Asia' and Percentage > 50 " +
                            "order by PopDens ASC " +
                            "limit 10;");

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
        }
    }
}
