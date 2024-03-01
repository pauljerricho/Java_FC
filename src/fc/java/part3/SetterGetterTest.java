package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        vo.setPhone("010-9987-1245");
        vo.setAge(11);
        vo.setName("홍길동");
        System.out.println(vo.getName());
        System.out.println(vo.getPhone());
        System.out.println(vo.getAge());
    }
}
