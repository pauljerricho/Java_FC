package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f; // 기본이 double이기 때문에 f를 붙여 float으로 인식
        boolean b = false;
        char c = 'A';
        java.lang.String s = "Apple";
        System.out.println("s = " + s);
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        System.out.println("binary = " + binary);
        int octal = 0105;
        System.out.println("octal = " + octal);
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);

    }
}
