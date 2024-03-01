package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input One Number! : ");
        int num = sc.nextInt(); // Block
        System.out.println("num = " + num);

        System.out.print("Input One Float! : ");
        float f = sc.nextFloat();
        System.out.println("f = " + f);

        sc.nextLine(); // Buffer
        System.out.print("Input String! : ");
        String s = sc.next();
        System.out.println("s = " + s);

        sc.nextLine(); // Remove Buffer

        System.out.print("Input String! : ");
        String s1= sc.nextLine();
        System.out.println("s = " + s);

    }
}
