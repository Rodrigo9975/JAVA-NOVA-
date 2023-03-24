import java.util.Scanner;
import java.util.Random;
public class quartersToDollars 
{

	public static void main(String[] args) 
	{
		 final int number = 100;  // Number of number
		 Scanner keyboard = new Scanner(System.in);
		 Random generator = new Random();   // A random number generator
		 
		  
		 int random;
		 double money;
		 
		 for(int n=1;n <= 10;n++) 
	      {
	    	  random = generator.nextInt(100);
	    	  money = quatersToDollars(random);
	    	  System.out.println("porra");
	      }
	}
	public static double quatersToDollars(int num)
	 {
		double dollar;
		dollars = num*25
	 }
}