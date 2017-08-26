import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		if (name.equals("Paola")) {
			JOptionPane.showMessageDialog(null, "You have a remarkable backpack");
		} else if (name.equals("Wendy")) {
			JOptionPane.showMessageDialog(null, "You have remarkable shoes ");
		} else if (name.equals("Celena")) {
			JOptionPane.showMessageDialog(null, "You dress remarkably");

		} else {
			JOptionPane.showMessageDialog(null, "You are remarkably awesome");

		}
	}
}