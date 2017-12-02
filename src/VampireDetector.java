import javax.swing.JOptionPane;

public class VampireDetector {

	public static void main(String[] args) {
		String sleep = JOptionPane.showInputDialog(" Do you sleep in the day ? ");
		String light = JOptionPane.showInputDialog(" Do you like the light ? ");
		String garlic = JOptionPane.showInputDialog(" Do you like Garlic ? ");
		if (sleep.equals("yes") && light.equals("no") && garlic.equals("no")) {
			JOptionPane.showMessageDialog(null, " You are a vampire ");
		} else if (sleep.equals("maybe") && light.equals("maybe") && garlic.equals("maybe")) {
			JOptionPane.showMessageDialog(null, "You are most likely a vampire");
		} else {
			JOptionPane.showMessageDialog(null, " Congratulations, you are not a vampire ");
		}
	}
}