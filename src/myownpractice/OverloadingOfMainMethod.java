package myownpractice;

public class OverloadingOfMainMethod {
	

	public static void main() // first
	{
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println();
	}

	public static void main(int x, int y)  //second
	{
		
		System.out.println(x + y);
		System.out.println();
	}

	public static void main(int a, int b, int c) // third
	{
		System.out.println(a + b + c);
		System.out.println();
	}

	public static void main (int x, double y) // fourth
	{
		System.out.println(x + y);
		System.out.println();
	}

	public static void main(String[] args) {
		OverloadingOfMainMethod m1 = new OverloadingOfMainMethod();// call first method
		OverloadingOfMainMethod m2 = new OverloadingOfMainMethod();// call second method
		OverloadingOfMainMethod m3 = new OverloadingOfMainMethod();// call third method
		OverloadingOfMainMethod m4 = new OverloadingOfMainMethod();// call fourth method
		m1.main();
		m2.main(30, 40);
		m3.main(10,20,30);
		m4.main(10, 20.5);
		

	}

}
