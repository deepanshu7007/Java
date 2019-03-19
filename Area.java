import java.util.Scanner;
class Area
{
	void area(double radius)
	{
		double area = (3.14)*(radius*radius);
		System.out.println("The area of the Circle is:"+area);
	}
	void area(double length,double breadth)
	{
		System.out.print("The area of the rectangle is:"+(length*breadth));	
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Area a = new Area();
		double  radius,length,breadth;
		int ch;
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.print("Enter your choice:");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.print("Enter the radius:");
				radius=s.nextInt();
				a.area(radius);
				break;
			}
			case 2:
			{
				System.out.print("Enter the length:");
				length=s.nextInt();
				System.out.print("Enter the breadth:");
				breadth=s.nextInt();
				a.area(length,breadth);
				break;
			}
		}
		
	}
}