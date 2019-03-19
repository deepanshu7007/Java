import java.util.Scanner;
class Arrays
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the values to the array:");
			arr[i]=s.nextInt();
		}
		System.out.println("The Values of the array are as Under");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}