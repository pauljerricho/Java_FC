package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        float f[] = new float[5];
        for (int i = 0; i < f.length; i++) {
            f[i] = 10.5f;
            System.out.println(f[i]);
        }
        int[] a = {10,20,30,40,50};

        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        float[] b = new float[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        int[] c;
        c = new int[]{10,20,30,40,50};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


    }
}
