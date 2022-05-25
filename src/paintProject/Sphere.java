package paintProject;

class Sphere extends Shape 
{
   private  int radius;
	double PI = 3.14;
	
	public Sphere(int radius) 
	{
		
		this.shapeName = Sphere.class.getSimpleName();
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
