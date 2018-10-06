import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitit {
	static Robot flash = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flash.sparkle();
		flash.setPenWidth(50);
		flash.setPenColor(66, 244, 197);
		flash.setSpeed(20);
		flash.penDown();
		flash.turn(25);
		for (int i = 0; i < 2; i++) {
			flash.move(120);
			flash.turn(120);
		}

		flash.penUp();
		flash.turn(60);
		flash.move(50);
		flash.turn(-50);
		flash.penDown();
		flash.move(60);
		flash.penUp();
		flash.move(90);
		flash.turn(80);
		flash.sparkle();
	}

}
