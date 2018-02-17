import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		String rollercoaster = JOptionPane.showInputDialog("What is your height in inches?");
		int height = Integer.parseInt(rollercoaster);
		if (height > 48) {
			JOptionPane.showMessageDialog(null, "You may enter the rollercoaster");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grow first");
		}

	}
}
