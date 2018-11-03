import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot flash = new Robot();

	public static void main(String[] args) {
		
		flash.setSpeed(10);
		int colorR = 0;
		int colorG = 0;
		int colorB = 0;
		String color = JOptionPane.showInputDialog(null, "What color do you want red, orange, or yellow ?");
		String shape = JOptionPane.showInputDialog(null, "What shape do you want circle, triangle, or square?");

		if (color.equalsIgnoreCase("Red")) {
			colorR = 255;
			colorG = 0;
			colorB = 0;
		} else if (color.equalsIgnoreCase("orange")) {
			colorR = 255;
			colorG = 165;
			colorB = 0;
		} else {
			colorR = 255;
			colorG = 215;
			colorB = 0;
		}

		if (shape.equalsIgnoreCase("Square")) {
			drawSquare(colorR, colorG, colorB);
		} else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle(colorR, colorG, colorB);

		} else {
			drawCircle(colorR, colorG, colorB);
		}
	}

	private static void drawSquare(int r, int g, int b) {
		flash.setPenWidth(50);
		flash.setPenColor(r, g, b);
		flash.penDown();
		for (int i = 0; i < 4; i++) {
			
			flash.move(90);
			flash.turn(90);	
		}
		flash.sparkle();
	}

	private static void drawTriangle(int r, int g, int b) {
		flash.setPenWidth(50);
		flash.setPenColor(r, g, b);
		flash.penUp();
		flash.turn(-90);
		flash.move(90);
		flash.penDown();
		for (int i = 0; i < 3; i++) {
			flash.move(120);
			flash.turn(120);
		}
			flash.sparkle();
			

	}

	private static void drawCircle(int r, int g, int b) {
		flash.setPenWidth(50);
		flash.setPenColor(r, g, b);
		flash.penDown();
		for (int i = 0; i < 36; i++) {
			flash.move(10);
			flash.turn(10);

		}
		flash.penUp();
		flash.turn(90);
		flash.sparkle();
	}

}