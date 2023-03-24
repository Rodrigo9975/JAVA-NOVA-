import java.util.Scanner;

public class inputproblem
{
	public static void main(String[]args)
	{
		long name;
		int age;
		double income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is Your Age : ");
		age = keyboard.nextInt();
		
		System.out.print("What is Your Annual Income : ");
		income = keyboard.nextDouble();
		
		System.out.print("What is Your Name : ");
		name = keyboard.nextLong(); 
		System.out.println("hello, " + name + " " + "of age" + " " + age + " " + "your income is " + " " +income );
	

		
	}
	
}