import java.util.Scanner;
import javax.swing.*;
// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final double SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                 // Line of output
      String  firstName;
  	  String  lastName;
  	  String  fullName;
  	  char firstInitial;
  	  double diameter;
	  double volume;
  	
  	  Scanner keyboard = new Scanner(System.in);
  	
     

      // TASK #2 declare variables used here
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (BOILING_IN_F - 32)* 5/9 ;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      System.out.println("what is your name ? ");
   	 firstName = keyboard.nextLine();
      
      // Read the user's first name
      // Prompt the user for last name
   	 System.out.println("what is your last name ? ");
  	 lastName = keyboard.nextLine();
      // Read the user's last name
      // Concatenate the user's first and last names	
      // Print out the user's full name
      System.out.println();      // To leave a blank line
      //String firstName = JOptionPane.showInputDialog(null,"Enter Name"); 
      //String lastName = JOptionPane.showInputDialog(null,"Enter Name");

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      // Print out the user's first initial
      System.out.println(lastName+" "+firstName);
  	  firstInitial = firstName.charAt(0);
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase
  	//FfullName = fullName.toUpperCase();

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      // Read the diameter
      // Calculate the radius
      // Calculate the volume
      // Print out the volume
   }
}
