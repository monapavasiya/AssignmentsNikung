package paintProject;

class Sphere extends Shape 
{
	int radius;
	double PI = 3.14;
	
	public Sphere(int radius) 
	{
		this.radius = radius;
	}

	@Override
	 public double area()
	{
		return 4*PI*(radius*radius);
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + "]";
	}

}
