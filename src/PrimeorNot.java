import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Give me a number and i will tell you if it is prime");
		int finalNumber = Integer.parseInt(number);
		if (finalNumber == 2) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		}
		if (finalNumber % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime");
		}
	for(int i=3; i<finalNumber; i++) {
		// if(finalNumber % i)
			//print if prime or not
	}
	}

}