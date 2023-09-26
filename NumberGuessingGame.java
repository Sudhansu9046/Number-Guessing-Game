import java.util.Scanner;
import java.util.Random;

class Main {

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the start range: ");
        int a = sc.nextInt();
        System.out.print("Enter the end range: ");
        int b = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();

        int secretNumber = random.nextInt(b - a + 1) + a;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game! " + name);
        System.out.println("I have chosen a number between " + a + " and " + b + ". Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
