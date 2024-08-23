import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inputs {
    // Create ArrayList to store the Courses
    ArrayList<Courses> courseList = new ArrayList<Courses>();
    double GPA;
    double RoundedGPA;
    String continueInput;
    double GP;
    int TotalCredits = 0;
    double TotalGP = 0;
    boolean active = true;

    public ArrayList<Courses> Input() {

        // Declaring the BufferedReader with try-with-resources to ensure it automatically
        // closes after execution
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            
            do {
                System.out.println("Enter course name: ");
                String CourseName = reader.readLine();

                System.out.println("Enter course code ");
                String CourseCode = reader.readLine();

                System.out.println("Enter your grade: ");
                String Grade = reader.readLine();

                System.out.println("Enter the Credit Unit: ");
                int Credit = Integer.parseInt(reader.readLine());

                Courses course = new Courses(CourseName, CourseCode, Grade, Credit);

                GP = course.getGradePoint();
                courseList.add(course);

                TotalCredits += Credit;
                TotalGP += GP;

                System.out.println("Type 'done' to finish or Enter to continue: ");
                System.out.println("");
                continueInput = reader.readLine();
                if(continueInput.equalsIgnoreCase("done"))
                    active = false;

            } while (active);

        } catch (Exception e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

        GPA = TotalGP / TotalCredits;
        return courseList;
    }
    
    public double showGPA() {
        return GPA;
    }

    public double getTotCred() {
        return TotalCredits;
    }

    public double getTotGP() {
        return TotalGP;
    }
}
