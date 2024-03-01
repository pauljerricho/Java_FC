package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // Input one fc.java.part2.Book
        Scanner sc = new Scanner(System.in);
        // Title
        System.out.print("Title : ");
        String title = sc.nextLine();
        System.out.println("Title = " + title);

        // Price
        System.out.print("Price : ");
        int price = sc.nextInt();
        System.out.println("Price = " + price);

        sc.nextLine(); // Remove Buffer

        // Publisher
        System.out.print("Publisher : ");
        String publisher = sc.nextLine();
        System.out.println("Publisher = " + publisher);

        // Author
        System.out.print("Author : ");
        String author = sc.nextLine();
        System.out.println("Author = " + author);

        // Page
        System.out.print("Page : ");
        int page = sc.nextInt();
        sc.next();
        System.out.println("Page = " + page);

        sc.nextLine(); //Remove Buffer

        // ISBN
        System.out.print("ISBN : ");
        String isbn = sc.nextLine();
        System.out.println("ISBN = " + isbn);
    }
}
