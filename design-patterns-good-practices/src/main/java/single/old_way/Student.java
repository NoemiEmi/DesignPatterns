package single.old_way;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    //metoda:
    public void enrolInCourse(String courseName){
        System.out.println("Student " + name + "was enroled in course: " + courseName);
    }
    public void saveInDb(){
        System.out.println();
    }

        public void sendEmail( String subject, String body){
            System.out.println("Sending email object: " + subject + "to student: " +name+ "\n" +body);
        }
    }

