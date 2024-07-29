import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void Input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of courses");
    
        try{
            String courses = reader.readLine();
            int CourseNumber = Integer.parseInt(courses);

            System.out.println("You entered: " + CourseNumber);
    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
