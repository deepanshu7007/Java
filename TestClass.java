import java.util.Scanner;
class TestClass
{
	String name;
	int std;
	int rollno;
	float marks;
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Name:");
		name=s.next();
		System.out.print("Enter the Std:");
		std=s.nextInt();
		System.out.print("Enter the Marks:");
		marks=s.nextFloat();
	}
	void output()
	{
		System.out.println("Name:"+name);
		System.out.println("Class:"+std);
		System.out.println("Marks:"+marks);
		System.out.println("Rollno.:"+rollno);
	}
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.input();
		t.output();
	}
}