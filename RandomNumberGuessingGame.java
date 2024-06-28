package random;
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
	public static void main(String[] args) {
		int attempt = 1, guess, randomNumber = random.nextInt(100) + 1;
		System.out.println("You have 10 attempts to guess a number within 1 to 100: ");
		do {
            System.out.println("Attempt "+attempt);
			System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            if(attempt!=10) {
                if(guess>=1 && guess<=100) {
                	if(guess==randomNumber) {
                		System.out.println("You guessed the number!");
                	}
                	else if(guess>randomNumber) {
                		System.out.println("Guess a lower number");
                	}
                	else if(guess<randomNumber) {
                		System.out.println("Guess a higher number");
                	}
                }
                else {
                	System.out.println("Invalid input!");
                }
            }
            else {
            	System.out.println("You have ran out of attempts.");
            	break;
            }
        	attempt++;
        }while(guess!=randomNumber);
	}
}
