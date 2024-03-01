package fc.java.part2;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        int a, b;
        int Max, Min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input One Num");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("Input One Num");
        b = sc.nextInt();
        sc.nextLine();
        Min = (a < b) ? a : b;
        Max = (a > b) ? a : b;
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);
    }
}
