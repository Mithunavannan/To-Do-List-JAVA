import java.util.Random;
import java.util.Scanner;

public class numguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int secretnumber = random.nextInt(100) + 1;

        int guess;
        int attempt = 0;
        System.out.println("Number guessing game");


        do { 
            System.out.println("Enter ur guess: ");
            guess = scanner.nextInt();
            attempt++;

            if (guess < secretnumber) {
                System.out.println("Guessed number too low");
            } else if (guess > secretnumber) {
                System.out.println("Guess number too high");
            } else{
                System.out.println("Correct Answer!!" + secretnumber + "in" + attempt + " attempts.");
            }
        } while (guess != secretnumber);

        scanner.close();
    }
}
