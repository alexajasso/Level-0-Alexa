import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color");
		Robot turtle = new Robot();
		turtle.penDown();
		turtle.setSpeed(100);
		turtle.setPenColor(237, 156, 233);
		turtle.turn(120);
		turtle.move(230);
		turtle.turn(120);
		turtle.move(230);
		turtle.turn(120);
		turtle.move(230);
		turtle.sparkle();
	}

}
