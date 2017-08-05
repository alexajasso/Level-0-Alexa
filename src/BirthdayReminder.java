import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "October 5th";
		String dadsBirthday = "Feburary 24th";
		String myBirthday = "June 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog(" what birthday do you want ? (type MOM,DAD,MY)");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (birthday.equals("MOM")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (birthday.equals("DAD")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (birthday.equals("MY")) {
            JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday ! ");
		}
	}

}
