class see
{
	public static int x =10;
	public see()
	{
		x++;	
	}
}
class testsee
{
	public static void main(String[]args)
	{
		see z = new see ();
		for (int i = 1;1 <= 100;i++)
			z = new see();
	}
}
	
