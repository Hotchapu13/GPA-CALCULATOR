
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

    GPAcalculatorGUI() {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GPACalculator GUI");
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new GPAcalculatorGUI();
    }

}