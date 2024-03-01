package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메서드가 있다. -> Default Constructor

    public PersonVO() {
        // 객체를 생성하는 초기는 내부에서 만들어진다.
        // 객체의 초기화를 한다.

        this.name = "이순신";
        this.age = 20;
        this.phone = "010-8989-4949";
    }
    // 생성자의 오버로딩
    public PersonVO(String name, int age, String phone){
        // 메서드 오버로딩
        // 메서드 이름은 같되, 매개변수가 다른 경우
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this.name
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; // this.age
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone; // this.phone
    }

    public String toString(){
        return this.name + "\t" + this.age + "\t" + this.phone;
    }
}
