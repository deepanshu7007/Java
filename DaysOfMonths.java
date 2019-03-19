import java.util.Scanner;
class DaysOfMonths
{
	public static void main(String[] args)
	{
		int val;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the position of month:");
		val=s.nextInt();
		int Months[]={31,28,31,30,31,30,31,31,30,31,30,31};
		String str[]={" January"," Feburary"," March"," April"," May"," June"," July"," August"," September"," October"," November"," December"};
		System.out.println("The Month is:"+str[val-1]);
		System.out.println("And"+str[val-1]+" has:"+Months[val-1]+"Days");
	}
}