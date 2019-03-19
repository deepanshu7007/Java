class objectCompare
{
	String string;
	int a;
	objectCompare(String string,int a)
	{
		
	}
	objectCompare(objectCompare obj1,objectCompare obj2)
	{
		int flag=1;
		if(obj1.string == obj2.string)
		{
			if(obj1.a==obj2.a)
			{
				System.out.println("These two objects are equal");
			}else
				System.out.println("Strings are equal but not Ages");
		}else
			System.out.println("None of the entered thing is correct");
	}
	public static void main(String[] args)
	{
		objectCompare obj = new objectCompare("Deepanshu",18);
		objectCompare obj1 = new objectCompare("Deepanshu",18);
		new objectCompare(obj,obj1);
		System.out.println(obj1.toString());
	}
}