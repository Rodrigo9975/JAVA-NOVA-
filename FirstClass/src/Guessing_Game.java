import java.util.Scanner;

import java.util.Random;


public class Guessing_Game 
{

	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner(System.in);
		 Random generator = new Random();
		 
		 
		  int num;         // Value of the random number
	      int guess;       // Value of the guess
	      
    	  num = generator.nextInt(101);

	      
	      
	      while(true)
	      {
	    	  System.out.println(" guess what the number is :");
	          guess = keyboard.nextInt();
	    	  
	    	  if(num == guess)
	    	  {
		    	  System.out.println(" owhw you got right congratulations  ");
		    	  break;
	    	  }
	    	  else if(num < guess)
	    	  {
		    	  System.out.println(" Too high, try again. ");
	    	  }
	    	  else 
	    	  {
		    	  System.out.println(" Too low, try again. ");
	    	  }
	      }	 
	}
}