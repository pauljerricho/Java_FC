package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        // score : 0 ~ 100

        if (score > 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("A class");
            } else if (score >= 85) {
                System.out.println("B class");
            } else if (score >= 80){
                System.out.println("C class");
            } else {
                System.out.println("Fail");
            }
        }
        else {
            System.out.println("Invaild Score");
        }
    }
}
