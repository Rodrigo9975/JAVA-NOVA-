class oop1
{
	private int a;
	private int b;
	private static int c = 4;
	
	public static void cat()
	{
		System.out.println(c);
	}
	public void inc()
	{
		c++;
	}
	public static void main(String[]args)
	{
		oop1.cat();
		oop1 x = new oop1();
		x.inc();
		x.inc();
		oop1.cat();
		x.cat();

		
	}
	
}
