import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {
		int score = 0;
		String ans = JOptionPane
				.showInputDialog("hello,ready to take a quick quiz? you will need the exact name to get a point");
		if (ans.equals("yes")){
			JOptionPane.showMessageDialog(null, "okay we will start this quiz");
		}
		else {
			JOptionPane.showMessageDialog(null, "well have a good day");

		}
		String answer = JOptionPane.showInputDialog(
				"first question,what are 2  games from game shakers show that you can also get it for free at the app store");
		if (answer.equals("Skywhale, Ballarina")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		 answer = JOptionPane.showInputDialog(
				"second question,do turtles live on land or water");
		if (answer.equals("water")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		answer = JOptionPane.showInputDialog(
				"third question,do snapping turtles eat hard food or soft food");
		if (answer.equals("both")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		
		answer = JOptionPane.showInputDialog(
				"fourth question,do tortoise live on water or land");
		if (answer.equals("land")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		
		answer = JOptionPane.showInputDialog(
				"fith question,whatyes species do turtles fall under");
		if (answer.equals("reptiles")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		
		answer = JOptionPane.showInputDialog(
				"sixth question, what are 2 different types of food to snapping turtles eat");
		if (answer.equals("watermwlon shells and lettuce")){
		JOptionPane.showMessageDialog(null, "correct");
		score++;
		}
		
		JOptionPane.showMessageDialog(null, score);
		
		
	}
}
