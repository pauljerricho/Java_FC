package fc.java.part2;

public class BookTest {
    public static void main(String[] args) {
        // Q. [정수] 힌 개를 저장할 변수를 선언하시오.
        int a;
        // Q. 한 권의 책 데이터를 저장하고 출력하시오? 6개의 변수로
        String title = "Java";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbm = "ISBN-1119990011";
        System.out.println(title+"\t"+price+"\t"+company+"\t"+company+"\t"+author+"\t"+page+"\t"+isbm);
        // 개별로 변수를 만들어가지고 인위적으로 책 한권의 모양처럼 만들 수 있으나 다른 클래스의 이용은 힘들다.


        // Q. [책] 힌 개를 저장할 변수를 선언하시오.
        Book b = new Book();
        // 1. 변수를 선언하고 fc.java.part2.Book b;
        // 2. 객체를 생성하고 ★★★ new fc.java.part2.Book(); 실체(instance)
        // 3. 생성된 객체를 연결(저장)하고 b = new fc.java.part2.Book();
        b.title = "Java";
        b.author = "박민재";
        b.company = "FastCampus";
        System.out.println("b = " + b);

    }

}
