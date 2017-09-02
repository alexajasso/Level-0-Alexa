import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(input);
		if (age < 18) {
			JOptionPane.showMessageDialog(null, "No one cares what you think!!!");
		} else {
			JOptionPane.showInputDialog("Who do you think will be the next president?");
		}
	}
}
