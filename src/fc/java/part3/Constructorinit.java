package fc.java.part3;

import fc.java.model.PersonVO;

public class Constructorinit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName() + "\t" + vo.getPhone() + "\t" + vo.getAge());
    }
}
