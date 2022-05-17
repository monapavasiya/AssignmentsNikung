package myownpractice;

public class ReverseSentence 
{

	public static void main(String[] args) 
	{
		String s = "Hi my name is Mona. I will do my best to learn Java.";
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--)  //length is 52
		{
			r= r+s.charAt(i);
		}
		System.out.println(r);
	}
}
