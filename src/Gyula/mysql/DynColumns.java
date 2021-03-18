package Gyula.mysql;

import java.sql.*;

public class DynColumns {
    private static String sqlQuery_1 =
            "select Country.Name, round(Population / Area, 2) PopDens " +
                    "from encompasses " +
                    "join country on encompasses.Country = Country.code " +
                    "where encompasses.Continent = 'Asia' and Percentage > 50 " +
                    "order by PopDens ASC " +
                    "limit 10;";
    private static String sqlQuery_2 = "select * from province limit 10;";



    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mondial?user=gyula&password=gyula");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery_2);

            printResult(rs);
        } catch (SQLException se){
            se.printStackTrace();
        }
    }

    public static void printResult(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();

        System.out.print("|");
        for (int i = 1; i <= md.getColumnCount(); i++) {
            if (md.getColumnType(i) == Types.VARCHAR) {
                System.out.printf(" %-" + Math.max(md.getColumnDisplaySize(i), md.getColumnName(i).length()) + "s |", md.getColumnName(i));
            } else {
                System.out.printf(" %" + Math.max(md.getColumnDisplaySize(i),md.getColumnName(i).length()) +"s |", md.getColumnName(i));
            }
        }
        System.out.println();

        System.out.print("|");
        for (int i = 1; i <= md.getColumnCount(); i++) {
            System.out.printf(" %s |", "-".repeat(Math.max(md.getColumnDisplaySize(i), md.getColumnName(i).length())));
        }
        System.out.println();


        while (rs.next()){
            System.out.print("|");
            for (int i = 1; i <= md.getColumnCount(); i++) {
                if (md.getColumnType(i) == Types.VARCHAR){
                    System.out.printf(" %-" + Math.max(md.getColumnDisplaySize(i), md.getColumnName(i).length()) + "s |", rs.getString(i));
                } else {
                    System.out.printf(" %" + Math.max(md.getColumnDisplaySize(i), md.getColumnName(i).length()) + "s |", rs.getString(i));
                }
            }
            System.out.println();
        }
    }
}
