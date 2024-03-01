package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car Info
        int carSn = 1100;
        String carName = "BMW828i";
        int carPrice = 902090;
        String carOwner = "Hong";
        int carYear = 2015;
        String carType = "G"; // 'G' -> char

        CarDTO car = new CarDTO(); // Making Instance

        car.carS = carSn; // Binding
        car.carY = carYear;
        car.carT = carType;
        car.carP = carPrice;
        car.carOW = carOwner;
        car.carN = carName;

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
    // Para -> Car Info -> Print
}
