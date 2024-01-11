package single.old_way;

public class StudentApp {
    public static void main(String[] args) {
        //we will create a student and do some "work" with him
        Student student = new Student("John ");
        student.enrolInCourse("Dessign Patterns");
        student.saveInDb();
        student.sendEmail("Hello ", "Course will take place at 18.");
    }
}
