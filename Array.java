import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int arr[];
		arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<5;i++)
			System.out.println("The "+(i+1)+" value is:"+arr[i]);
	}
}