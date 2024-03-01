package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectinstance {
    public static void main(String[] args) {
        Student st1; // st1 : Object
        Student st2; // st2 : Object
        Student st3; // st3 : Object

        st1 = new Student("Hong","Elec","info@gmail.com","01089894848",35,2012); // st1 : Instance
        st2 = new Student("Kim","Elec","info2@gmail.com","01089894848",34,2011); // st2 : Instance
        st3 = new Student("Song","Elec","info3@gmail.com","01089894848",33,2010); // st3 : Instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
