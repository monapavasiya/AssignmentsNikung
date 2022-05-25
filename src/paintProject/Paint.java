package paintProject;

import java.text.DecimalFormat;

public class Paint {
	public static final double coverage = 350;

	public void amount(Shape s) {
		System.out.println("Computing amount for " + s);
		double amount = s.area() / coverage;

		DecimalFormat fmt = new DecimalFormat("0.##");

		System.out.println(s.getShapeName() + " = " + fmt.format(amount));
		System.out.println();

	}

	@Override
	public String toString() {
		return "Paint [coverage=" + coverage + "]";
	}

}
