public class exemple
{
	public static void displayNumbersGreaterThanN(int[] arr, int n) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		final int n1 = 5;

		displayNumbersGreaterThanN(array, n1);
	    for (int num : arr) 
	    {
	        if (num > n1) 
	        {
	            System.out.println(num);
	        }
	    }
	}
}
	
