import java.util.ArrayList;

public class BigClass {

    ArrayList<Student> studentList = new ArrayList<>();



    class Student extends Person{

        int studentID;

        public Student(int age, String name, int studentID) {
            super(age, name);
            this.studentID = studentID;
        }
    }


}

