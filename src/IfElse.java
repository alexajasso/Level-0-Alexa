import javax.swing.JOptionPane;

// create a String variable set to 'yes'
// if variable is yes, print 'happy'
// otherwise print 'sad'
// then print 'Wednesday'
public class IfElse {

	public static void main(String[] args) {
		String turtle = "yes";
		if (turtle.equals("yes")) {
			JOptionPane.showMessageDialog(null, "happy");

		} else {
			JOptionPane.showMessageDialog(null, "sad");
		}
		JOptionPane.showMessageDialog(null, "Wednesday");

	}
}