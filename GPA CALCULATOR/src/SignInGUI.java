import javax.swing.*;

//creating the SignIn java class
public class SignInGUI {
    JFrame frame;
    JLabel label1;
    JLabel label2;
    JButton button1;
    JButton button2;
    JTextField textField1;
    JPasswordField password;

    // building the constructor for the frame
    //positioning @ component onto the frame
    SignInGUI(){
        frame = new JFrame("Sign In");
        label1 = new JLabel("Student Email");
        label1.setBounds(30, 50, 100, 30);
        label2 = new JLabel("Password");
        label2.setBounds( 30,100, 100,30);
        button1 = new JButton("Sign In");
        button1.setBounds(100, 200, 100, 30);
        button1.setFocusable(false);
        button2 = new JButton("Cancel");
        button2.setBounds(300, 200, 100, 30);
        button2.setFocusable(false);
        textField1 = new JTextField("please enter your student email");
        textField1.setBounds(150, 50, 250, 30);
        password = new JPasswordField();
        password.setBounds(150, 100, 250, 30);

        //adding all the components to the frame(button, labels and password fields)
        frame.add(label1);
        frame.add(label2);
        frame.add(button1);
        frame.add(button2);
        frame.add(textField1);
        frame.add(password);

        //setting the attributes of my frame
        frame.setSize(500,300);                         //size of the frame
        frame.setResizable(false);                                   //prevents re-sizing of the frame
        frame.setLayout(null);
        frame.setVisible(true);                                      //makes the frame visible on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //ensures the application closes on pressing the exit button in the frame

    }

    public static void main(String[] args) {
        new SignInGUI();
    }
}
