import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitit {
	static Robot flash = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flash.setPenColor(66, 244, 197);
		flash.setSpeed(20);
		flash.penDown();
		flash.turn(25);
		for (int i = 0; i < 2; i++) {
			flash.move(120);
			flash.turn(120);
		}

		flash.penUp();
		//flash.move();

	}

}
