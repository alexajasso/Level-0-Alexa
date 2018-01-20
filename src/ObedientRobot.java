import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot flash = new Robot();

	public static void main(String[] args) {
		

		String shape = JOptionPane.showInputDialog(null, "What shape do you want?");
		if (shape.equalsIgnoreCase("Square")) {
			drawSquare();
		}

		else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();

		} else {
			drawCircle();
			String color = JOptionPane,showInputDialog(null, "what color do you want ?");
			
			
			
			
		}
	}

	private static void drawSquare() {
		flash.setPenColor(255, 0, 0);
		flash.penDown();
		flash.setSpeed(100);
		flash.move(90);
		flash.turn(90);
		flash.move(90);
		flash.turn(90);
		flash.move(90);
		flash.turn(90);
		flash.move(90);
		flash.turn(90);
		flash.sparkle();
	}

	private static void drawTriangle() {
		flash.setPenColor(255, 165, 0);
		flash.penUp();
		flash.turn(-90);
		flash.move(90);
		flash.penDown();
		flash.setSpeed(100);
		for (int i = 0; i < 3; i++) {
			flash.move(120);
			flash.turn(120);
			flash.sparkle();
		}

	}

	private static void drawCircle() {
		flash.setPenColor(255, 215, 0);
		flash.penDown();
		flash.setSpeed(100);
		for (int i = 0; i < 36; i++) {
			flash.move(10);
			flash.turn(10);

		}
		flash.penUp();
		flash.turn(90);
		flash.sparkle();
	}

}