import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
	public static void main(String[] args) {
		Random random = new Random();
		int rand1 = 1 + random.nextInt(55);
		int rand2 = 2 + random.nextInt(55);
		int rand3 = 3 + random.nextInt(55);
		int rand4 = 4 + random.nextInt(55);
		int rand5 = 5 + random.nextInt(55);
		JOptionPane.showMessageDialog(null,
				"Your selected numbers are " + rand1 + " " + rand2 + " " + rand3 + " " + rand4 + " " + rand5 + ".");

	}
}