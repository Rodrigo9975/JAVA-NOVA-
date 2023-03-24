import java.util.Scanner;


	public class chata
	{
	   public static void main(String[] args)
	   {
		   int num;
		   int low;
		   int total = 0;
		   double avg;
		   int count = 0;
		   
		   Scanner keyboard = new Scanner(System.in);
		   
		   System.out.println("enter number : ");
		   num = keyboard.nextInt();
		   
		   low = num;

		  while(num > 0) 
		  {
			  total = total + num;
		  if(num < low)
			  low = num;
		  count++;
		  System.out.println("enter number : ");
		  num = keyboard.nextInt();
	      }
		   avg = total/count;
		   
		   System.out.println("avegere is : "+" "+ avg);
		   System.out.println("the lowers number  is : "+" "+ low);
		  

	   }
	} 
	  
