package fc.java.part2;

// 영화(Object) -> 제목, 개봉일, 주인공, 장르, 러닝타임, 등급.....
public class MovieTest {
    public static class Movie{
        public String title;
        public String release;
        public String main_char;
        public String genre;
        public int time;
        public String flim_rating;
    }

    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.release = "2022.12.14";
        m.main_char = "제이크 설리";
        m.genre = "액션";
        m.time = 192;
        m.flim_rating = "12세";
        System.out.println(m.title+"\t"+m.release+"\t"+m.main_char+"\t"+m.genre+"\t"+m.time+"\t"+m.flim_rating);
    }
}
