package fc.java.part3;
import java.sql.*;

public class DB_TEST {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try {
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
            System.out.println("Driver Load");
            con = DriverManager.getConnection(dbUrl, "scott","tiger");
            System.out.println("DB Connecting..");
            stmt = con.createStatement();

//            rs = stmt.executeQuery("SELECT * FROM DEPT");
            rs = stmt.executeQuery("INSERT INTO FC_CAR VALUES ('FERARI')");
//            while (rs.next()){
//                System.out.println(
//                        rs.getString("dname") + "\t" +
//                        rs.getString("deptno")+ "\t" +
//                        rs.getString("loc"));
//            }

        } catch (SQLException e) {
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
