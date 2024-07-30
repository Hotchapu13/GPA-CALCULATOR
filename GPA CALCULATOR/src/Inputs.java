import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inputs {
    ArrayList<Courses> courseList = new ArrayList<Courses>();
    
    public ArrayList<Courses> Input() {
       
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String continueInput;
            do{
                System.out.println("Enter course name: ");
                String CourseName = reader.readLine();
    
                System.out.println("Enter course code ");
                String CourseCode = reader.readLine();
    
                System.out.println("Enter your grade: ");
                String Grade = reader.readLine();

                System.out.println("Enter the Credit Unit: ");
                int Credit = Integer.parseInt(reader.readLine());
    
                Courses course = new Courses(CourseName, CourseCode, Grade, Credit);
                courseList.add(course);
    
                System.out.println("Next course: (yes/no)");
                continueInput = reader.readLine();
    
            } while (continueInput.equalsIgnoreCase("yes"));

        } catch (Exception e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

        return courseList;
    }
}
