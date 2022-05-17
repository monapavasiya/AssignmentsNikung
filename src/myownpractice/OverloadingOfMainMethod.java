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
		OverloadingOfMainMethod m1 =new OverloadingOfMainMethod();
		m1.main();
		m1.main(30, 40);
		m1.main(10,20,30);
		m1.main(10, 20.5);
		

	}

}
