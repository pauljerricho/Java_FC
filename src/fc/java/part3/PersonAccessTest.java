package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Hong";
        p.age = 20; // ?
        p.phone = "010-1111-2222";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

    }
}
