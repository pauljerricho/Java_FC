package fc.java.part2;// java에서는 배열을 객체로 취급한다.

public class ArrayBasicTest {
    public static void main(String[] args) {
        String c[] = new String[10];

        for (int i = 0; i < 10; i++) {
            if (i%2==0)
                c[i] = "애플";
            else
                c[i] = "삼성";
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }

        Book b1, b2, b3;
        Book[] books = new Book[3];

        int a[] = {10,20,30};
        for (int i = 0; i < 3; i++) {
            System.out.println("a = " + a[i]);
        }
        int b[][] = {{10,20,30},{40,50,60},{70,80,90}};
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);
            }
        }
    }
}
