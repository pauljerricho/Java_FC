package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(35.6f,56.7f);
        System.out.println("sum = " + v);
        int vv = add(3,5);
        System.out.println("sum = " + vv);
    }
    // 정적 바인딩 : 컴파일이 끝나면 메서드가 이미 결정나 있다.
    // 컴파일 할 때 메서드 이름을 변경해버린다.
    // 동적 바인딩 : 오버라이딩
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static float add(float a, float b){
        float sum = a + b;
        return sum;
    }

}
