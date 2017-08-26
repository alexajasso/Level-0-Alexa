import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String unbirthday = JOptionPane.showInputDialog("when's your birthday");
		if (unbirthday.equals("August 26")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday");

		}

	}                     
}
