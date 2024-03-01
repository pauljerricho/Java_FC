package fc.java.part3;
// Object = 상태정보(멤버변수) + 행위정보(메서드)
public class Person {
    // Default Counstructor

    public String name;
    public String phone;
    public int age;

    public Person(){

    }
    public void play(){ System.out.println("Playing"); }
    public void eat(){
        System.out.println("Eating");
    }
    public void walk(){
        System.out.println("Walking");
    }

}
