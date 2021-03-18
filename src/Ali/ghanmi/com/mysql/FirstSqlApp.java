package Ali.ghanmi.com.mysql;

import java.sql.*;
import java.util.Scanner;

public class FirstSqlApp {
    private static String url = "jdbc:mysql://localhost:3306/notis";
    private static String user = "root";
    private static String pw = "@Aliben@";
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("User id eingeben");
    int useriD = sc.nextInt();


    Connection conn = null;
        try {
        conn = DriverManager.getConnection(url,user,pw);
        PreparedStatement ps = conn.prepareStatement("select * " +
                "from user " +
                "join notis on notis.id = user.id " +
                "where user.id= ? ");

        ps.setInt(1,useriD);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println(rs.getString("text"));
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







        /*
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


}
*/