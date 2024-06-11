package Task1;
// Tsak1: Number game
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class NumberGame {

    public static void main(String args[]) throws IOException {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Number Game.");
        System.out.println(" A random number b/w 1-100. by the system");
        System.out.println("Guess that random number. ");
        System.out.print("Enter the Number of Rounds you want to play the Game : ");
        int rounds = obj.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.println();
            System.out.println("Round " + i + " begins ...\n");

            System.out.println("Enter the no. of limits you want to guess the number:");
             int limit = obj.nextInt();
             
                    
                    System.out.println("The limit is just " +limit+ " .\nIf you have guessed the number in " +limit+ " or less attempts you have won the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number has been generated...");

                    int count = 1;
                    whileloop: while (count <= limit) {
                        System.out.println("\nNo of guesses remaining : " + (limit - count +1) + " ...\n");
                        System.out.print("Enter you guess number " + count + ": ");
                        int guess = obj.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess
                                    + " is HIGHER than Generated Number. Pleaase try to Guess again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess
                                    + " is LOWER than Generated Number. Pleaase try to Guess again...");
                        } else {
                            System.out.println(
                                    "The number " + guess + " is EQUAL to than Generated Number.\nCongrats it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    if (count > limit) {
                        System.out.println(
                                "Sorry!!! You were not able to guess the number in " + limit + " attempts.\nThe Generated Number was "
                                        + randomNumber + "\nBETTER LUCK NEXT TIME\n");
                   
                }
                 
            

            System.out.println("ROUND " + i + " is OVER.");
        }
        System.out.println("\nAll the Rounds are over.\nThank You for Playing the Game.");
        
    }
}
