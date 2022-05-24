package paintProject;

public abstract class Shape 
{
	String shapeName;
	abstract  double  area();
	
	@Override
	public String toString() {
		return "shape [shapeName=" + shapeName + "]";
	}	
}

 





