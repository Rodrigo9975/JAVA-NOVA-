import java.util.Scanner;

public class LASTNAME 
{
public static void main (String [] args)
{
	  String  firstName;
 	  String  lastName;
 	  String  fullName;
 	  char firstinitial;
 	  double diameter;
 	 // double volume;
 	  
 	
 	  Scanner keyboard = new Scanner(System.in);
 	
 	  System.out.println("what is your name ? ");
 	 firstName = keyboard.nextLine();
 	 System.out.println("what is your last name ? ");
 	 lastName = keyboard.nextLine();
 	 System.out.println(lastName+" "+firstName);
 	 firstinitial = firstName.charAt(0);
 	System.out.println(firstinitial);
 	fullName = fullName.toUpperCase();
 	
 	System.out.println("diameter");
 	diameter= keyboard.nextDouble();
 	//volume = Math.PI * Mach.pow((diameter/2),3)*4/3;
	//System.out.printf("the volume is : %.3f", volume); 



}
}


