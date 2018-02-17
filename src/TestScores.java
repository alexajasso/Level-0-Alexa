import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What is your test score out of 100%?");
		int grade = Integer.parseInt(test);
		if (grade > 90 && grade <= 100) {
			JOptionPane.showMessageDialog(null, "Wow! Good Job!!!");
		} else if (grade > 80 && grade <= 90) {
			JOptionPane.showMessageDialog(null, "Okay,job you could do better.");

		} else if (grade > 70 && grade <= 80) {
			JOptionPane.showMessageDialog(null, "Are you okay?");

		} else if (grade > 60 && grade <= 70) {
			JOptionPane.showMessageDialog(null, "You're doing worse.");

		}else {
			JOptionPane.showMessageDialog(null, "Are you even trying?");
		
		}
		
	}
}
