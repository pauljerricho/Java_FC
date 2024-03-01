package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(101);
        vo.setPhone("010-8989-4949");
        System.out.println(vo.getName() + "\t" + vo.getPhone() + "\t" + vo.getAge() );
    }
}
