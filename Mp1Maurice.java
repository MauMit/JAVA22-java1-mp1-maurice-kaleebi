package miniproject;

import java.util.*;
 // Maurice Kaleebi JAVA 22
public class Mp1Maurice {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		int myNumber = 0;
		int rand = (int) (0 + (Math.random() * 100));
		int attempts = 0;
		int tryAgain = 0;
		System.out.println("Pick a number between 0-100");

		do {
			if (tryAgain == 1) {

				System.out.println("Welcome back!");
				System.out.println("Pick a number between 0-100");
				rand = (int) (0 + (Math.random() * 100));
				tryAgain = 0;
			}
			attempts++;
			myNumber = myScanner.nextInt();
			boolean resp = isCorrectNumber(rand, myNumber);

			if (resp == true) {
				System.out.println("You guessed correct, amount of tries " + attempts);
				System.out.println("Would you like to play again? Press 1, or Press 2 to close");
				tryAgain = myScanner.nextInt();
				attempts = 0;
			}

		} while (tryAgain != 2);
		System.out.println("Thank you for playing");
		myScanner.close();
	}

	static boolean isCorrectNumber(int randomNumber, int selectedNumber) {
		if (randomNumber > selectedNumber) {
			System.out.println("Higher");
			return false;

		} else if (randomNumber < selectedNumber) {
			System.out.println("Lower");
			return false;
		}
		return true;
	}
}
