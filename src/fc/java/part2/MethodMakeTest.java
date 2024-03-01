package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = add(a,b);
        System.out.println("sum = " + result);
    }
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

