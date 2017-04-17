/**
 * 
 */
package pkg30daysofcode;

import java.util.Scanner;

/**
 * @author S Y S Venkatesh
 *
 */
public class Day26 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int date_a = sc.nextInt();
		int month_a = sc.nextInt();
		int year_a = sc.nextInt();
		int date_e = sc.nextInt();
		int month_e = sc.nextInt();
		int year_e = sc.nextInt();
		int fine=0;
		if(year_a > year_e)
		{
			fine=10000;
		}
		else if(year_a == year_e)
		{
			if(month_a > month_e)
			{
				fine= 500 * (month_a - month_e);
			}
			else if(month_a == month_e && date_a > date_e)
				fine= 15 * (date_a - date_e);
		}
		System.out.println(fine);
	}

}
