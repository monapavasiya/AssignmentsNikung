package paintProject;

class Cylinder extends Shape
{
	int radius;
	int height;
	double pI = 3.14;
	
	public Cylinder(int radius, int height) 
	{
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double area()
	{
		return pI*(radius*radius)*height;
	}
	
	@Override
	public String toString() 
	{
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}
}
