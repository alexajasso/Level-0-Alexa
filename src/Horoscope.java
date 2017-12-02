import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		String star = JOptionPane.showInputDialog(null, " What is your Zodiac Sign ? ");
		if (star.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Avoid going in an elevator");
		} else if (star.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Avoid eating chocolate");
		} else if (star.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Your the most awesome person in the world");
		} else if (star.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Your cool ");
		} else if (star.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Avoid being loved or bad things will happen");
		} else if (star.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You will have a sad ending");
		} else if (star.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You will be cherished");
		} else if (star.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You will never be loved");
		} else if (star.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Avoid being hit");
		} else if (star.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "You will have in Adventure");
		} else if (star.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You will have gifts");
		} else if (star.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "A fait awaits for you");
		} else {
			JOptionPane.showMessageDialog(null, "Thats not a star sign!");
		}
	}

}
