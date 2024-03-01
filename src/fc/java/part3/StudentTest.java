package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 90;
        arr[3] = 50;
        arr[4] = 10;
        arr[5] = 10;

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        Student vo = new Student("홍길동","컴퓨터공학과","bit@empas.com","01099874493",30,2024);
        System.out.println(vo.toString());
    }

}
