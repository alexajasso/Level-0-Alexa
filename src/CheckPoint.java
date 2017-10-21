import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color");
		Robot r2d2 = new Robot();
		
	}

}
