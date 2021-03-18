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
    private static String sqlQuery_2 = "select * from province;";



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
        for (int i = 1; i <= md.getColumnCount(); i++) {
            System.out.printf("%20s %20s %5d %10s %5d%n", md.getColumnLabel(i), md.getColumnName(i), md.getColumnDisplaySize(i), md.getColumnTypeName(i), md.getColumnType(i));
        }
    }
}
