package paintProject;

import java.text.DecimalFormat;

public class PaintThings 
{
	public static void main(String[] args)
	{
		 double COVERAGE =350;
		 
		 Paint paint = new Paint(COVERAGE);
		 
		 Sphere bigBall =new Sphere(15);
		 Rectangle deck= new Rectangle(20, 35);
		 Cylinder tank= new Cylinder(10, 30);
		 
		  double deckAmt, bigBallAmt, tankAmt;
		  
		  bigBallAmt = paint.amount(bigBall);
		  deckAmt = paint.amount(deck);
		  tankAmt = paint.amount(tank);
		  System.out.println();
		  
		 
		 DecimalFormat fmt =new DecimalFormat("0.##");
		 System.out.println("Amount of paint needed for various shapes");
		 System.out.println("*********");
		 
		 System.out.println("Sphere: "+ fmt.format(bigBallAmt));
		 System.out.println();
		 
	     System.out.println("Rectangle: "+ fmt.format(deckAmt));		
         System.out.println();
         
		 System.out.println("Cylinder: "+ fmt.format(tankAmt));
		
		 }  
	}


