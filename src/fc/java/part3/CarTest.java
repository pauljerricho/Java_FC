package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
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

        CarUtility carUtility = new CarUtility();
        carUtility.carPrint(car);
    }
}
