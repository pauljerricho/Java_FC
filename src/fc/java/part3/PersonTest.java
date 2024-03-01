package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Making Instance.
        Person p = new Person();

        // 생성자
        // 객체를 메모리에 생성하는 역할을 한다.
        // 생성자는 리턴타입이 없다.
        // . 참조 연산자 객체가 생성된 뒤에 메모리에 접근하는법

        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-9999-1234";

        System.out.println(p.name+ "\t" + p.age + "\t" + p.phone );
        p.eat();
        p.play();
        p.walk();

        Person p1 = new Person();

        p1.name = "나길동";
        p1.age = 30;
        p1.phone = "010-9999-1235";

        System.out.println(p1.name+ "\t" + p1.age + "\t" + p1.phone );
        p1.eat();
        p1.play();
        p1.walk();
    }
}
