package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // FlowChart
        Scanner sc = new Scanner(System.in);
        // multiples of 7
        System.out.println("Input One Integer");
        int a = sc.nextInt();
        if (a % 7 == 0){
            System.out.println("multiples of 7");
        } else {
            System.out.println("No");
        }
        // Input Age 19▲
        System.out.println("Input Age 19▲");
        int age = sc.nextInt();
        if (age >= 19){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}
