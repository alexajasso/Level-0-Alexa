import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are You Happy ?");
		if ((happy.equalsIgnoreCase("yes")) || (happy.equalsIgnoreCase("y"))) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
		} else if ((happy.equalsIgnoreCase("no")) || (happy.equalsIgnoreCase("n"))) {
			String input = JOptionPane.showInputDialog("Do You Want To Be Happy?");
			if ((input.equalsIgnoreCase("no")) || (input.equalsIgnoreCase("n"))) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing.");
			} else {
				JOptionPane.showMessageDialog(null, "Change Something.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Its a YES or NO answer");
		}

	}
}