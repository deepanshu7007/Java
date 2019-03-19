public class Protected
{
	
	static int val1;
	static double marks;
	Protected()
	{
		val1=12;
		marks=13;
	}
	protected void finalize()
	{
		System.out.println("The Object is Destroyed");
	}
	public static void main(String[] args)
	{
		Protected p = new Protected();
		System.out.println("Value:"+val1);
		System.out.println("Marks:"+marks);
	}
}