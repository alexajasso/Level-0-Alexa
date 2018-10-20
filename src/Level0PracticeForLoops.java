
public class Level0PracticeForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = -10; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println("Hello world!" + i);
			} else if (i % 2 == 0) {
				System.out.println("Foo bar!" + i);
				if (i % 2 == 0) {
					System.out.println("Hello world!" + i);
					System.out.println("Foo bar!" + i);
				}
			}
		}

	}
}