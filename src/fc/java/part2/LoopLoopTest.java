package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
            int[][] a = {
                    {1,2,3,4,5},
                    {1,2,3,4,5}
            };

            for (int k = 0; k < a.length; k++) {
                System.out.println();
                for (int m = 0; m < a[k].length; m++) {
                    System.out.print(a[k][m] +"\t");
                }
            }
        }
    }
