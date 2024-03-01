package fc.java.part2;
// JavaSE 프로그램
// 객체지향 언어는 클래스들의 모임
// 클래스의 첫자는 대문자!
// 시작, 메인 클래스
// main() {} -> 메서드
// public 접근제어자 공용으로 허용한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 두 개의 정수를 더하여 출력하는 프로그램
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("a를 입력하시오.");
        a = sc.nextInt();
        System.out.println("b를 입력하시오.");
        b = sc.nextInt();
        System.out.println("a+b = ");
        sum = a+b;
        System.out.println(sum);
    }
}
