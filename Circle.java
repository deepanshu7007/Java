class Circle
{
	private double radius;
	private String color;
	Circle()
	{
		radius=1.0;
		color="Red";
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return(3.14*(this.radius*this.radius));
	}
	public double getRadius()
	{
		return this.radius;
	}
	public static void main(String[] args)
	{
		Circle c = new Circle();
		System.out.println("The radius of the Circle is:"+c.radius);
		System.out.println("The Color of the Circle is:"+c.color);
		Circle c1 = new Circle(12.1);
		System.out.println("The Area of the Circle is:"+c1.getArea());
		System.out.println("The Radius of the Circle is:"+c1.getRadius());
	}
}