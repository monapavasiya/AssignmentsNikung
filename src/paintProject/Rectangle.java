package paintProject;

class Rectangle  extends  Shape
{
      int length;
      int width;
      
	public Rectangle(int length, int width) 
	{
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
