package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        // 2X4
        int[][] a = new int[2][4];
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                a[i][j] = 1;
                System.out.print(a[i][j]);
            }
        }
    }
}
