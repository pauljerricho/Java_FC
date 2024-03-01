package fc.java.part3;

import fc.java.model.MyUtil_;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil_
        MyUtil_ mu = new MyUtil_();
        int sum = mu.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
