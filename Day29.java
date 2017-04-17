/**
 * 
 */
package pkg30daysofcode;

import java.util.Scanner;

/**
 * @author S Y S Venkatesh
 *
 */
public class Day29 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) 
		{
			int n = in.nextInt();
			int k = in.nextInt();

			int max = 0;

			for (int j = 1; j < n; j++) 
			{
				for (int m = j + 1; m <= n; m++) 
				{
					int h = j & m;
					if (h < k && max < h) 
						max = h;
				}
			}

			System.out.println(max);
		}

	}
}
