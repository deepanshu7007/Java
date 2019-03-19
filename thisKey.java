import java.util.Scanner;
class data
{
	String name;
	int age;
	int rollno;
	float marks;
}
class thisKey extends data
{
	void Input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name:");
		name=s.nextLine();
		System.out.println("Enter the Age:");
		age=s.nextInt();
		System.out.println("Enter the rollno:");
		rollno=s.nextInt();
		System.out.println("Enter the Marks:");
		marks=s.nextFloat();
	}
	void Display()
	{
		System.out.println("The Entered Data is as under\n");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("rollno:"+rollno);
		System.out.println("Marks"+marks);
	}
	public static void main(String[] args)
	{
		thisKey tk = new thisKey();
		tk.Input();
		tk.Display();
	}
}