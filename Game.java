/*

A number-guessing game.

*/
import java.util.Scanner;  //import the scanner class
public class Game {
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Hello, what's your name?");

    String userName = myObj.nextLine();
    System.out.println(userName + ", I'm thinking of a number between 1 and 100. Try to guess my number.");


  }

}
