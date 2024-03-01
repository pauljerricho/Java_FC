package fc.java.part2;

import java.util.Scanner;

public class FourArthmetic {
    public static void main(String[] args) {
        int a, b, sum, minus, mul, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("a, b를 입력하세요!");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        minus = a > b ? (a - b) : (b - a);
        mul = a * b;
        div = b != 0 ? (a / b) : 0;
        System.out.println("덧셈 : " + sum);
        System.out.println("뺄셈 : " + minus);
        System.out.println("곱셈 : " + mul);
        System.out.println("나눗셈 : " + div);
    }
}
