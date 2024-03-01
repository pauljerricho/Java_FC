package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO; // import
import java.lang.*; // default package
import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        fc.java.model.CarDTO car = new fc.java.model.CarDTO();
        CarDAO dao = new CarDAO();
    }
}
