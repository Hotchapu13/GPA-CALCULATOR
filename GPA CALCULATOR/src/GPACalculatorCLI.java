
/**
 * Compilation:   javac App.java
 * Execution:     java  App
 * Dependencies:  Inputs.java Courses.java 
 * 
 * @author Nuwe Bryant Nyero
 * 
 * CLI application to calculate GPA 
 * 
 */
import java.util.ArrayList;

public class GPACalculatorCLI {
    public static void main(String[] args) throws Exception {
        Inputs inputs = new Inputs();
        ArrayList<Courses> courses = inputs.Input();

        for (Courses course : courses) {
            System.out.println("");
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Grade: " + course.getGrade());
            System.out.println("");
        }
        System.out.println("total credits "+ inputs.getTotCred());
        System.out.println("total grade point "+ inputs.getTotGP());
        System.out.println("___RESULTS___");
        System.out.println("Your GPA is " + inputs.showGPA());
    }
}
