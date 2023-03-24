import java.util.Scanner;

public class Software_Sales 
{

	public static void main(String[] args) 
	{
		final double price = 99;
		double total, num, cost, discount;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many unit you get ? ");
	    num = keyboard.nextDouble();
	    
	    if (num < 0)
	    	System.out.println("your discount is   "+ discount);
	    	
	    else if (num < 10)
	    	discount = 0;
	    else if (num < 20)
	    	discount = 0.2;
	    else if (num < 50)
	    	discount = 0.3;
	    else if (num < 99)
	    	discount = 0.4;
	    else
	    	discount = 0.5;
	    cost = num*price;
	    total =cost - discount;
	    discount = discount * cost;
	    
	    System.out.println("your discount is   "+ discount);
	     
	    System.out.println("your total is  "+ total);
	    
	    
	    	
	}
	

}
