
public class testerclock 
{
	public static void main(String[]args)
	{
		clock c1 = new clock(58,50,13);
		c1.tick();
		System.out.println(c1);
		c1.tick();
		System.out.println(c1);
		c1.tick();
		System.out.println(c1);
		//constructor
		clock c2 =new clock(c1);
		System.out.println(c1);
		System.out.println(c2);
		// 
		if( c2.equals(c1))
			System.out.println("fuck");


	}

}
