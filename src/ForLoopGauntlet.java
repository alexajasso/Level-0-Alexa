
public class ForLoopGauntlet {

	public static void main(String[] args) {
		// Display all numbers from 0-100
		// for(int i=0; i<=100; i++) {
		// System.out.println(i);

		// Display all numbers from 100-0
		// for (int i = 100; i >= 0; i--) {
		// System.out.println(i);

		// Display all even numbers 2-100
		// for (int i = 2; i <= 100; i++) {
		// if (i % 2 == 0) {
		// System.out.println(i);

		// Display all odd numbers 1-99
		// for (int i = 1; i <= 99; i++) {
		// if (i % 2 == 1) {
		// System.out.println(i);

		// Display all multiples of 7 from 0 to 777
		// for (int i = 7; i <= 777; i = i + 7) {
		// System.out.println(i);

		// Display years you were alive
		// for (int i = 2006; i <= 2018; i++) {
		// int age = i - 2006;
		// System.out.println("In " + i + " I was " + age + " years old");

		// for(int i = 0; i <= 2; i++ ) {
		// for(int j = 0 ; j<=2; j++) {
		// System.out.println( i+ " "+j);
		// }
		// }
		// for(int i= 0; i<=6; i+=3){
		// for(int j= 1; j<=3 ;j++){
		// System.out.print(i+j +" ");
		// }
		// System.out.println("");
		// }

		// for (int i = 0; i <= 90; i += 10) {
		// for (int j = 1; j <= 10; j += 1) {
		// System.out.print(i + j + " ");
		// }
		// System.out.println("");
		// }

		// }

		// }

		for (int i = 0; i <= 5; i += 1) {
			for (int j = 1; j <= i + 1; j += 1) {
				System.out.print(" * ");
			}
			System.out.println(i + 1);
		}

	}

	{

	}

}
