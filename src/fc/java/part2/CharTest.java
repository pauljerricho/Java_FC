package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A

        // Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오.

        int a = 'A';
        System.out.println("a = " + a);

        int b = 'B'+1;
        System.out.println("b = " + (char)b); // 캐스팅 -> 형변환

        char han = '가';
        System.out.println("han = " + han);

        int hanD = '가'; //44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00';
        System.out.println("hanU = " + (char)hanU);

        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오. 아스키코드 참조
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower); // 'a'

        char lower1 = 'u';
        int upper1 = lower1 - 32; // 117-32=85
        System.out.println("upper1 = " + upper1);
    }
}
