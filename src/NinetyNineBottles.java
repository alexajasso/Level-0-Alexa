import javax.swing.JOptionPane;

public class NinetyNineBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
//		for (int i = 99; i > 1; i--) {
////			System.out.println(i + "bottles of beer on the wall" + i + "bottles of beer 
//					+ "Take one down and pass it around,"+ (i-1)+"bottles of beer on the wall.");
//		}
=======
		for (int i = 99; i > 0; i--) {
			if (i == 2) {
				System.out.println(i + " bottles of beer on the wall " + i + " bottles of beer"
				+ " Take one down and pass it around," + (i - 1) + " bottle of beer on the wall.");
			}
		
			
		else if (i == 1) {
				System.out.println(i + " bottle of beer on the wall " + i + " bottle of beer"
						+ " Take one down and pass it around," + " no more bottles of beer on the wall.");
			}
			else {
				System.out.println(i + " bottles of beer on the wall " + i + " bottles of beer"
						+ " Take one down and pass it around," + (i - 1) + " bottles of beer on the wall.");
			}

		}
>>>>>>> origin/master

	}

}
