package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // CarInfo From Keyboard -> DB (JDBC)
        // Car Info -> From Keyboard -> Input Stream
        Scanner sc = new Scanner(System.in);
        System.out.print("Car Number : ");
        int carS = sc.nextInt();

        // Remove Buffer
        sc.nextLine();

        System.out.print("Car Name : ");
        String carN = sc.nextLine();

        System.out.print("Car Price : ");
        int carP = sc.nextInt();

        sc.nextLine();

        System.out.print("Car Owner : ");
        String carOW = sc.nextLine();

        System.out.print("Car Year : ");
        int carY = sc.nextInt();

        sc.nextLine();

        System.out.print("Car Type : ");
        String carT = sc.nextLine();
//        We need CARDTO , CARVO
//        System.out.println(carS + "\t" + carP + "\t" + carY + "\t" + carT + "\t" + carOW + "\t" + carN);
        fc.java.model.CarDTO car = new fc.java.model.CarDTO();
        car.carN = carN;
        car.carS = carS;
        car.carT = carT;
        car.carOW = carOW;
        car.carP = carP;
        car.carY = carY;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
//        dao.carSelect();
//        dao.carDelete(car);
    }
}
