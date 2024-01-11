package single.new_way;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("John ");

        CourseManager courseManager = new CourseManager();
        courseManager.enrolInCourse(student.getName(),"Design Patterns");

        StudentRepository repository = new StudentRepository();
        repository.saveInDb(student.getName());

        EmailService emailService = new EmailService();
        emailService.sendEmail(student.getName(), "Hello ", "Course will take place at 18.");
    }
}
