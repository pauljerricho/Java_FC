package fc.java.part2;

public class BasicArrayTest {

    public static void main(String[] args) {
        float[] f = {24.5f, 45.6f, 77.65f};
        for (int i = 0; i < 3; i++) {
            System.out.println(f[i]);
        }
        Book[] D = new Book[3];
        D[0] = new Book();
        D[0].title = "자바";
        D[0].page = 300;
        D[0].price = 30000;
        D[0].isbn = "isbn-91000382";
        D[0].company = "한솔미디어";
        D[0].author = "박한솔";

        D[1] = new Book();
        D[1].title = "파이썬";
        D[1].page = 240;
        D[1].price = 15000;
        D[1].isbn = "isbn-91000332";
        D[1].company = "오렐리";
        D[1].author = "제이콥스";

        D[2] = new Book();
        D[2].title = "인생은 아름다워";
        D[2].page = 550;
        D[2].price = 3000;
        D[2].isbn = "isbn-91000111";
        D[2].company = "삼성";
        D[2].author = "이재용";


        for (int i = 0; i < D.length; i++) {
            System.out.println();
            System.out.println("Title = " + D[i].title);
            System.out.println("Page = " + D[i].page);
            System.out.println("Price = " + D[i].price);
            System.out.println("Isbn = " + D[i].isbn);
            System.out.println("Company = " + D[i].company);
            System.out.println("Author = " + D[i].author);

        }

    }


}
