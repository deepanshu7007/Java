class DaysMonths
{
	String name;
		int Days;
		DaysMonths(String name,int Days)
		{
			this.name=name;
			this.Days=Days;
		}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		DaysMonths dm[] = new DaysMonths[12];
		dm[0] = new DaysMonths("Jan",31);
		dm[1] = new DaysMonths("Feb",28);
		dm[2] = new DaysMonths("Mar",31);
		dm[3] = new DaysMonths("Apr",30);
		dm[4] = new DaysMonths("May",31);
		dm[5] = new DaysMonths("Jun",30);
		dm[6] = new DaysMonths("Jul",31);
		dm[7] = new DaysMonths("Aug",31);
		dm[8] = new DaysMonths("Sep",30);
		dm[9] = new DaysMonths("Oct",31);
		dm[10] = new DaysMonths("Nov",30);
		dm[11] = new DaysMonths("Dec",31);
		System.out.println("Enter Your Date(dd):");
		dd=s.nextInt();
		System.out.println("Enter the Month(mmm):");
		mm=s.nextLine();
		System.out.println("Enter the Year:(yyyy)");
		yy=s.nextInt();
	}
}