import java.util.Scanner;
import java.util.Random;
public class chapter_5_chama_outro 
{

	public static void main(String[] args) 
	{
		 final int number = 100;  // Number of number
		 Scanner keyboard = new Scanner(System.in);
		 Random generator = new Random();   // A random number generator
		 
		  
		 int even=0,odd=0,random;
		 
		 for(int n=1;n <= number;n++) 
	      {
	    	  random = generator.nextInt();
	    	  if(isEven(random))
	    	  {
	    		  
	    		  even++;
	    	  }
	    	  else 
	    	  {
	    		  odd++;
	    	  }
	      }
		 System.out.println("have"+" "+ even +" "+"Even"+" "+"and have"+" "+odd+" "+"Odd");
	}
	public static boolean isEven(int num)
	 {
		 if ((num % 2) == 0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
}