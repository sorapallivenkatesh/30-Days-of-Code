/**
 * 
 */
package pkg30daysofcode;

import java.util.Scanner;

/**
 * @author S Y S Venkatesh
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class Day28 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++) 
		{
			String name = in.next();
			String email = in.next();
			if(email.contains("@gmail.com"))
			{
				list.add(name);
			}
		}
		Collections.sort(list);
		for(String i : list)
		{
			System.out.println(i);
		}
	}
}