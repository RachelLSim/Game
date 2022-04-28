/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;



public class Game {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, what's your name?");

    String userName = scanner.nextLine();
    System.out.println(userName + ", I'm thinking of a number between 1 and 100. Try to guess my number.");

    Random rand = new Random();
    int number = rand.nextInt(100);
    System.out.println(number);
    int guess = -1;
    int guesses = 0;
    while (guess != number) {
      guesses++;
      try {
        System.out.println("Your guess? ");
        guess = scanner.nextInt();
      } catch (Exception e) {
        scanner.next();
        System.out.println("We need a whole number between 1 and 100.");
        continue;
      }
      if(guess > number){
        System.out.println("Too high. Guess again.");
      }else if(guess < number){
        System.out.println("Too low. Guess again.");
      }

    }
    System.out.println("Congratulations! The number was " + number + ". It took you " + guesses + " tries to find it.");
  }

}
