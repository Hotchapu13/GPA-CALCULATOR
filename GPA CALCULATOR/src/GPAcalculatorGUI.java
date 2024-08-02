
/**
 * Compilation:   javac GPAcalculatorGUI.java
 * Execution:     java  GPAcalculatorGUI
 * Dependencies:  Inputs.java Courses.java 
 * 
 * @author Nuwe Bryant Nyero
 * 
 * Interactive GUI used to demonstrate the GPA calculator 
 * 
 */

import javax.swing.JFrame;

public class GPAcalculatorGUI extends JFrame {
    JFrame frame;

    GPAcalculatorGUI() {
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GPAcalculatorGUI();
    }

}