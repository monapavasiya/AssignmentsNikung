package paintProject;

public class PaintThings {
	public static void main(String[] args) {

		Paint paint = new Paint();

		Shape s = new Sphere(15);
		Shape s1 = new Rectangle(20, 35);
		Shape s2 = new Cylinder(10, 30);

		
		System.out.println("Amount of paint needed for various shapes");
		System.out.println("*********");
		paint.amount(s);
		paint.amount(s1);
		paint.amount(s2);
		System.out.println();

	}
}
