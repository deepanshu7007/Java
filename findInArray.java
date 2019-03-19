import java.util.Scanner;
class findInArray
{
	public static void main(String[] args)
	{
		int f_val,flag,pos=0;
		int arr[] = new int[5];
		System.out.println("Enter the value you want to search in Array:");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++)
		arr[i]=s.nextInt();
		System.out.print("Enter the value you want to search:");
		f_val=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(f_val==arr[i])
			{
				pos=i;
				f_val=arr[i];
				break;
			}
		}
		lab:
		System.out.println("The position is:"+(po0s+1));
	}
}