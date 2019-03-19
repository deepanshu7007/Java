import java.util.Scanner;
class Sorting
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		int i=0,temp,j,val=0;
		System.out.print("Enter the values to the array:");
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		System.out.print(arr[i]+"\t");
		i=0;
		while(i<5)
		{
			val=arr[i];
			j=i+1;
			while(j<5)
			{
				if(val>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		i++;
		}
		System.out.print("The Entered Sorted array is:");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}