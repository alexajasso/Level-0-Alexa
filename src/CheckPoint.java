import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {

	public static void main(String[] args) {
		/*
		 * String color = JOptionPane.showInputDialog("What is your favorite
		 * color?"); JOptionPane.showMessageDialog(null, color + " is also my
		 * favorite color"); Robot turtle = new Robot(); turtle.penDown();
		 * turtle.setSpeed(100); turtle.setPenColor(237, 156, 233);
		 * turtle.turn(120); turtle.move(230); turtle.turn(120);
		 * turtle.move(230); turtle.turn(120); turtle.move(230);
		 * turtle.sparkle(); String name = "no"; if (name.equals("yes")) {
		 * JOptionPane.showMessageDialog(null, "happy");
		 * 
		 * } else { JOptionPane.showMessageDialog(null, "sad"); }
		 * System.out.println("Wednesday"); String turtle =
		 * JOptionPane.showInputDialog("whats your favorite animal"); if
		 * (turtle.equals("dog")) { JOptionPane.showMessageDialog(null,
		 * " Dogs go woof ");
		 * 
		 * } else if (turtle.equals("cat")) {
		 * JOptionPane.showMessageDialog(null, " Cats go meow ");
		 * 
		 * } else { JOptionPane.showMessageDialog(null,
		 * " I don't know that animal"); } Random rand = new Random(); int
		 * number = rand.nextInt(1000); int number1 = rand.nextInt(900);
		 * System.out.println("random number under 1000 " + number);
		 * System.out.println("random number under 900 " + number1);
		 * System.out.println(number + number1); System.out.println(number - );
		 */
		String cup = JOptionPane.showInputDialog("How many cups of flower do you have?");
		if (cup.equals("less than 2cups")) {
			JOptionPane.showMessageDialog(null, "Go buy more at the store");
			JOptionPane.showInputDialog("How many people are you going to give cookies to");
		} else if (cup.equals("more than 30")) {
JOptionPane.showMessageDialog(null,"your going to have to bake two batches of cookies !");
		
		
		}
	}
}
