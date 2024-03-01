package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO mem = new MemberDTO();
        mem.name = "홍길동";
        mem.phone = "010-8989-4949";
        // mem.age private
        // Method -> only public
        
    }
}
