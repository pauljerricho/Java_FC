package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6){
            System.out.println(i);
            i++;
        }
        System.out.println("List While");
        int j = 0;
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        while (j < num.length){
            System.out.println(num[j]);
            j++;
        }
        System.out.println(j);
        System.out.println("Do-While");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while (k < 5);
    }
}
