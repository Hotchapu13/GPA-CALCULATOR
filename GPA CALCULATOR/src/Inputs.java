import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inputs {
    ArrayList<Courses> courseList = new ArrayList<Courses>();
    double GPA;
    public ArrayList<Courses> Input() {
        String continueInput;
        double GP;
        int TotalCredits = 0;
        double TotalGP = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                System.out.println("Enter course name: ");
                String CourseName = reader.readLine();

                System.out.println("");
                System.out.println("Enter course code ");
                String CourseCode = reader.readLine();

                System.out.println("");
                System.out.println("Enter your grade: ");
                String Grade = reader.readLine();

                System.out.println("");
                System.out.println("Enter the Credit Unit: ");
                int Credit = Integer.parseInt(reader.readLine());

                Courses course = new Courses(CourseName, CourseCode, Grade, Credit);
                GP = course.getGradePoint();
                courseList.add(course);
                TotalCredits = Credit++;
                TotalGP = GP++;

                System.out.println("Next course: (yes/no)");
                System.out.println("");
                continueInput = reader.readLine();

            } while (continueInput.equalsIgnoreCase("yes"));

        } catch (Exception e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

        GPA = TotalGP / TotalCredits;
        return courseList;
    }
    
    public double showGPA() {
        return GPA;
    }

}
