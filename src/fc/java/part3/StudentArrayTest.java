package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {

        Student[] std = new Student[4];

        std[0] = new Student("Jake", "Computer","bit@google.com","01099458473",34,2013);
        std[1] = new Student("Elen", "Gym","acrc104@google.com","01049538473",32,2013);
        std[2] = new Student("Mike", "Chemic","chemic49@google.com","01093458473",31,2015);
        std[3] = new Student("Alie", "Medical","healer486@google.com","010934238473",39,2012);

        for (int i = 0; i < 4; i++) {
            System.out.println(std[i].toString());
        }
        System.out.println("-------------------------------");
        // Enhanced For
        for (Student st : std) {
            System.out.println(st.toString());
        }

    }
}
