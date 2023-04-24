public class shapes
{
	private double width;
	private double length;
	
	public shapes (double l ,double w)
	{
		length = l;
		width = w;
	}
	
	public void setwidth(double w)
	{
		width =w;
	}
	public void setlength(double len)
	{
		length =len ;
	}
	public double getwidth()
	{
		return width;
	}
	public double getlength()
	{
		return length;
	}
	public double getarea()
	{
		return length * width;
	}
	
	
	
}
