package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c = {'s','h','u','t','d','o','w','n'};
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'o') break;
            System.out.println(c[i]);
        }
        //Global Var
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0){
                count++;
            }
        }
        System.out.println("count = " + count);
        int count_B = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 != 0) continue;
            count_B++;
        }
        System.out.println("count = " + count_B);
    }
}
