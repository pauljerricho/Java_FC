package fc.java.part2;

public class MemberTest {
    public static class Member{
        public String name;
        public int age;
        public String tel;
        public String email;
        public String addr;
        public float weight;

    }
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "천성일";
        m.age = 31;
        m.addr = "대전광역시 동구 계족로 443번길 40";
        m.email = "decaf2021@naver.com";
        m.weight = 46.3f;
        m.tel = "010-8477-3383";
        System.out.println(m.name+"\t"+m.tel+"\t"+m.email+"\t"+m.age+"\t"+m.addr+"\t"+m.weight);
    }
}
