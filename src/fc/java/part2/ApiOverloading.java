package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int max = maxValue(6,9);
        System.out.println("max = " + max);

        int min = minValue(5,4);
        System.out.println("min = " + min);
    }
    public static int maxValue(int a, int b){
        return (a > b) ? a : b;
    }
    public static int minValue(int a, int b){
        return (a < b) ? a : b;
    }

}
