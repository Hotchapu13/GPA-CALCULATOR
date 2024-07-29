import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void Input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the course unit.");
    
        try{
            String input = reader.readLine();
            System.out.println("You entered: " + input);
    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
