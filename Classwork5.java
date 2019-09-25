
import java.util.Scanner;
public class Classwork5 // class header
{
    public static void main(String[] args) //method header
     { Scanner scan = new Scanner(System.in);
       //write a program that prompts a user to typer their name
      System.out.println("Whats your name?");
     String userName = scan.nextLine();
     if (userName.equals("Ezra") || userName.equals ("Ezra"))
      System.out.println("now thats a good name!");
      else if (userName.equals ("Gurtrude") || userName.equals("Gurtrude"))
      System.out.println("okay, " + userName + ". someone got made fun of in school");
      else
        System.out.println("okay, " + userName + ". Someone got made fun of in school");
     System.out.println("Whats your pets name?");
     String userPet = scan.nextLine();
     System.out.println("Whats your Gmail school passcode");
     String userPasscode = scan.nextLine();
     System.out.println("Whats your Social Security Code?");
     String userSsc = scan.nextLine();
     System.out.println("What is your credit card number?");
     String userCreditnum = scan.nextLine();
     System.out.println("And the 3 numbers on the back?");
     String userBacknum = scan.nextLine();
     System.out.println("Thank you!");
      }
    }
