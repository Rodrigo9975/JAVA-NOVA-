import java.util.Scanner;

public class Magic_date 
{

	public static void main(String[] args) 
	{
		int day;
		int month;
		int year;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("day ");// perguntar para o usuario
		   day = keyboard.nextInt();
		System.out.println("month ");// perguntar para o usuario
		   month = keyboard.nextInt();
		System.out.println("year ");// perguntar para o usuario
		   year = keyboard.nextInt();
		   if (year == day * month)
			   System.out.println(" #$%&*!!!date is magic!!!¨%#$&*");
		   else
			   System.out.println("vai se fuder !@#$");



}
}