package myownpractice;

public class HollowFullPyramid 
{/*
	 * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 							
								 
								 
 */

	public static void main(String[] args)
	{
		
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 6 - i; j > 1; j--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++)
			{
				if (j == 0 || j == i || i == 6 - 1) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
