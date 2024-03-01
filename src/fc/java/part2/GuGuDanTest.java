package fc.java.part2;

public class GuGuDanTest {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "DAN" + "\t");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "X" + i + "=" + j*i +"\t");
            }
        }
    }
}
