import Casting.*;
import Operator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // sc 입력 객체 생성
        Scanner sc = new Scanner(System.in);

        CastingEx1 castingEx1 = new CastingEx1();
        castingEx1.castingEx1();

        CastingEx4 castingEx4 = new CastingEx4();
        castingEx4.castingEx4();

        OperatorEx operatorEx = new OperatorEx();
        System.out.println("사칙연산 프로세스.. 두 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("a를 입력하세요. a : " + a);
        int b = sc.nextInt();
        System.out.println("b를 입력하세요. b : " + b);
        operatorEx.operatorEx1(a,b);
        operatorEx.operatorEx2(a,b);
        operatorEx.operatorEx3(a,b);
        operatorEx.operatorEx4(a,b);

    }
}