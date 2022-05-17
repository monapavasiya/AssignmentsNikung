package myownpractice;

public class CharactersCount 
{
	public static void main(String[] args) 
	{
		int count;
		
		String s = "Hi my name is mona. I will do my best to learn Java.";
		s = s.replace(" ", ""); // to remove space
		
		char[] ch = s.toCharArray(); // to convert string to caracter
		int l =s.length(); //lenghth is 52
		
		for(int i=0; i<l-1; i++)
		{
			count=1;
			for(int j=i+1; j<l; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					for(int k=j; k<l-1; k++)
					{
						ch[k]=ch[k+1];
					}
					l--;
				}
			}
			System.out.println(ch[i] + "=" + count);
		}  
	}
}
