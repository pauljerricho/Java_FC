package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        NoneStaticTest st = new NoneStaticTest();

        int sum = st.hap(10,20);
        System.out.println("sum = " + sum);
    }
    public int hap(int a, int b){
        int v = a + b;
        return v;
    }
}
