import javax.swing.JOptionPane;

public class RollerCoast {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many inches tall are you?");
		int height = Integer.parseInt(input);
		if (height < 48) {
			JOptionPane.showMessageDialog(null, "Sorry,you need to grow a little first!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Welcome to the ride!!!");
		}
	}
}
