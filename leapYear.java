import java.util.Scanner;
class leapYear
{
	public static void main(String[] args)
	{
		int val;
		System.out.println("Enter the year to find the leap-year:");
		Scanner s = new Scanner(System.in);
		val=s.nextInt();
		if((val%4)==0)
		{
			System.out.println("This year is a leap-year");
		}
		else
		{
			System.out.println("This year is not a leap year");
		}
	}
}