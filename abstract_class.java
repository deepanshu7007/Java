import java.util.Scanner;
class abstract_class
{
	public static void main(String[] args)
	{
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name:");
		name=String(s.next());
		if(name == "Deepanshu")
		{
			System.out.println("Welcome to You Deepanshu");
		}
		else
		{
			System.out.println("Fuck You");
		}
	}
}