package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        //  Q. 정수 한 개를 저장하기 위해서 변수를 선언하시오.
        int v; // 변수 선언 -> 메모리에 기억공간이 만들어진다.
        v = 10;
        System.out.println("v = " + v);

        int a = 10; // 변수 초기화
        int b = a;
        int c = a*b;
        System.out.println("c = " + c);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        int x = 20;
        int y = 10;
        int tmp;
        tmp=y;
        y=x;
        x=tmp;
        System.out.println("tmp = " + tmp);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
