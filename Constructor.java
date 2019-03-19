class Constructor
{
	int val1;
	int val2;
	Constructor(int val1,int val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("The value through constructor is:"+val1);
		System.out.println("The value througt Constructor is:"+val2);
	}
	public static void main(String[] args)
	{
		Constructor con = new Constructor(10,20);
		System.out.println("The value is:"+con.val1);
		System.out.println("The value is:"+con.val2);
	}
}