package paintProject;

class Rectangle  extends  Shape
{
      private int length;
      private int width;
      
	public Rectangle(int length, int width) 
	{
		
		this.shapeName = Rectangle.class.getSimpleName();
		this.length = length;
		this.width = width;
	}
	
	@Override
	 public double area()
	  {
		return length*width;
	  }

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
}
