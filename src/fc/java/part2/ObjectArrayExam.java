package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        MovieTest.Movie[] M1 = new MovieTest.Movie[3];

        M1[0] = new MovieTest.Movie();
        M1[0].title = "Life is Beatiful";
        M1[0].flim_rating = "G";
        M1[0].genre = "Romance";
        M1[0].main_char = "D.Beckham";
        M1[0].release = "1993.08.09";

        M1[1] = new MovieTest.Movie();
        M1[1].title = "Batman";
        M1[1].flim_rating = "R";
        M1[1].genre = "Action";
        M1[1].main_char = "C.Vale";
        M1[1].release = "2000.1.1";

        M1[2] = new MovieTest.Movie();
        M1[2].title = "SpongeBob";
        M1[2].flim_rating = "NC-17";
        M1[2].genre = "Horror";
        M1[2].main_char = "Sponge";
        M1[2].release = "2024.1.1";

        for (int i = 0; i < M1.length; i++) {
            System.out.println("======Movie["+(i+1)+"]======");
            System.out.println("Title = " + M1[i].title);;
            System.out.println("Rating = " + M1[i].flim_rating);;
            System.out.println("Genre = " + M1[i].genre);;
            System.out.println("Main = " + M1[i].main_char);;
            System.out.println("Release = " + M1[i].release);;
        }
    }
}
