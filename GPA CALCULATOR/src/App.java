import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Inputs inputs = new Inputs();
        ArrayList<Courses> courses = inputs.Input();

        for (Courses course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Grade: " + course.getGrade());
            System.out.println("");
        }
    }
}
