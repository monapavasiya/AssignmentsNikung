package paintProject;

public class Paint 
{
	double coverage;

	public Paint(double coverage) 
	{
		
		this.coverage = coverage;
	}

	public double amount(Shape s) 
	{
		System.out.println("Computing amount for " + s);
		return s.area() / coverage;
	}

	@Override
	public String toString()
	{
		return "Paint [coverage=" + coverage + "]";
	}

}