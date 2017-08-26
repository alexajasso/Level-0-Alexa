import javax.swing.JOptionPane;

public class Secretmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = JOptionPane.showInputDialog("What is the password");
		if (password.equals("turtles")) {
			JOptionPane.showMessageDialog(null, "I like turtles");

		} else {
			JOptionPane.showMessageDialog(null, "Intruder");
		}
	}
}
