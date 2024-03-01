package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = -5;
        if (x >= 0){
            System.out.println("0 or Positive Number");
        }
        else {
            System.out.println("Nagative number");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Input One Num");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        if (num % 12 == 0){
            System.out.println("multiples of 12");
        }else {
            System.out.println("");
        }
        System.out.println("Input One Year");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0))
            System.out.println("Lunar");
        else {
            System.out.println("None Lunar Year");
        }


    }
}
