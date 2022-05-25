package paintProject;

public abstract class Shape 
{
	  
   protected String shapeName;
	abstract  double  area();
	
	
	
	public String getShapeName() {
		return shapeName;
	}



	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}



	@Override
	public String toString() {
		return "shape [shapeName=" + shapeName + "]";
	}	
}

 





