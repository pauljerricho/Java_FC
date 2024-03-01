package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        System.out.println(vo.toString());

        // 개발자가 원하는 값으로 초기화를 하는 방법?
        PersonVO vo_o = new PersonVO("강수지",13,"010-0000-0000");
        System.out.println(vo_o.toString());

        PersonVO vo_o2 = new PersonVO("강감찬",31,"010-1000-1000");
        System.out.println(vo_o2.toString());
    }
}
