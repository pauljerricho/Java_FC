package fc.java.part2;

public class FoorLoopTest {
    public static void main(String[] args) {
        System.out.println("for_int");
        for (int i = 0; i < 30; i++) {
            System.out.println((char)(65+i)+" "+(int)(65+i));
        }
        System.out.println("");
        System.out.println("for_char");
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.println(c + " " + (int)c);
        }

        int[] num_lists = {1,2,3,4,5,6,7,8,9,10};
        // Enhanced For
        for (int num_list : num_lists)
        {
            System.out.print(num_list + " ");
        }

        // For
        for (int i = 0; i < num_lists.length; i++) {
            System.out.print(num_lists[i] + " ");

        }
    }
}
