import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot flash = new Robot();

	public static void main(String[] args) {
		drawSquare();
		drawTriangle();
		drawCircle();
	}

	private static void drawSquare() {
		flash.setPenColor(255, 0, 0);
		flash.penDown();
		flash.setSpeed(2000000000);
			flash.move(90);
		    flash.turn(90);
		    flash.move(90);
		    flash.turn(90);
		    flash.move(90);
		    flash.turn(90);
		    flash.move(90);
		    flash.turn(90);
	}

	private static void drawTriangle() {
	flash.setPenColor(255,165,0);	
		flash.penUp();
		flash.turn(-90);
		flash.move(90);
		flash.penDown();
		for (int i = 0; i < 3; i++) {
			flash.move(120);
			flash.turn(120);
		}

	}

	private static void drawCircle() {
		flash.setPenColor(255,215,0);
		flash.penUp();
		flash.move(90);
		flash.move(90);
		flash.move(90);
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