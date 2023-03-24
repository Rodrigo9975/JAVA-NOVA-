import java.util.Scanner;
public class array_chap7 
{
	public static void main(String[] args) 
	{
		
		final int array_size = 2;
		int [] hours = new int[array_size];
		int [] employeeID = { 5658845, 4520125, 7895122, 8777541, 8451277,1302850,7580489};
		double[] payrate = new double[array_size];
		double[] wages = new double[array_size];
        Scanner keyboard = new Scanner(System.in);

		
		for(int i=0;i < array_size;i++)
		{
			System.out.println("how many hours worked " + employeeID +"?  ");
			hours[i] = keyboard.nextInt();
			
			while(hours[i]<0 || hours[i]>40)
			{
				System.out.println("enter a number from 0 to 40.");
				hours[i] = keyboard.nextInt();
			}
			
			System.out.println("what is your pay rate ?  ");
			payrate[i] = keyboard.nextDouble();
			while(payrate[i] < 6  || payrate[i] > 100)
			{
				System.out.println("enter a number from 6 to 100.");
				payrate[i] = keyboard.nextInt();
			}
			wages[i] = payrate[i] * hours[i];
		}
		System.out.println("ID\thours\tpay rate\tgross pay");

		for(int i=0; i < array_size; i++)
			System.out.println(employeeID[i] +wages[i]+payrate[i]);
	}

}
/**int[]firstarray = {2,4,6,8,10};
 * int[]secondarray = new int[5];
 * for(int i =0; i < firstarray.length;i++)
 * System.out.print("cachoa du")*/
 