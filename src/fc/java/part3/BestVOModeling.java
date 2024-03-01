package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("Avartar",20221214,"Jake Sulli","Action",192.0f,12);
        System.out.println(vo.toString());
        System.out.println(vo.getLevel());
    }
}
