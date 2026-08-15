package Day20;

import java.util.Scanner;

public class GuessTheNumber
{
    static void main() {

        Scanner sc = new Scanner(System.in);

        int secret_number = (int)(Math.random() * 10);

        System.out.println("Secret: " + secret_number);

        int guess;

        while(true)
        {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if(guess == secret_number)
            {
                System.out.println("You won");
                break;
            }
            else if(guess < secret_number && guess >= 0)
            {
                System.out.println("Guess is lower");
            }
            else if(guess > secret_number && guess <= 9)
            {
                System.out.println("Guess is higher");
            }
            else {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }
}
