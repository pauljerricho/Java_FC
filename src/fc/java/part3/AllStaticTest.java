package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st = new AllStatic();
//        System.out.println(st.hap(10,20)); // 30
//        System.out.println(st.max(10,20)); // 20
//        System.out.println(st.min(10,20)); // 10
        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.min(10,20));

        System.out.println(Math.max(1,300));
        System.out.println(Math.random());
    }
}
