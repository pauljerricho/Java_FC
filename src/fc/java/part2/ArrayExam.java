package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = new char[]{'A','P','P','L','E'};
        // 32 차이가 난다.
        for (int i = 0; i < c.length; i++) {
            c[i] = (char)((int)c[i] + 32);
            System.out.println(c[i]);
        }
        int tmp = 0;
        int[] b = new int[6];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)((Math.random())*45+1);
            for (int j = 0; j < i; j++) {
                if (b[i]==b[j])
                    i--;
                    break;
            }
            System.out.print(b[i] + " ");
        }
//        for (int i = 0; i < b.length; i++) {
//            if (b[i]>b[i-1])
//                tmp = b[i-1];
//                b[i-1] = b[i];
//                b[i] = tmp;
//            System.out.println(b[i]);
//        }

    }
}
