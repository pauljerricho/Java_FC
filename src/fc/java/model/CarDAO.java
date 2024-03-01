package fc.java.model;

import java.sql.*;

public class CarDAO {
    // C, R, U, D
    public void carInsert(CarDTO car) {
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try {
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
            con = DriverManager.getConnection(dbUrl, "scott","tiger");
            stmt = con.createStatement();

            rs = stmt.executeQuery("insert into FC_CAR(car_name, car_num, car_price, car_type, car_own, car_year) values" +
                    "('"+car.carN+"','"+car.carS+"','"+car.carP+"','"+car.carT+"','"+car.carOW+"','"+car.carY+"')");
            System.out.println("CAR INFO INSERTING...");

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

    public void carSelect() {
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try {
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
            con = DriverManager.getConnection(dbUrl, "scott","tiger");
            stmt = con.createStatement();
            System.out.println("CAR INFO SELECTING...");
            rs = stmt.executeQuery("select * from FC_CAR");
            while (rs.next()){
                System.out.println(
                        rs.getString("car_name") + "\t" +
                        rs.getString("car_owner")+ "\t" +
                        rs.getString("car_price"));
            }
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

    public void carDelete(CarDTO car) {
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try {
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
            con = DriverManager.getConnection(dbUrl, "scott","tiger");
            stmt = con.createStatement();
            rs = stmt.executeQuery("delete from FC_CAR where car_num ="+car.carN);
            System.out.println("CAR INFO DELETING...");
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
