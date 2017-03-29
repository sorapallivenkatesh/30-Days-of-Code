package pkg30daysofcode;

import java.util.Scanner;
/**
*
* @author S Y S Venkatesh
*/
public class Day20 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int a_i=0; a_i < n; a_i++)
		{
			arr[a_i] = in.nextInt();
		}
		int count = 0,tmp=0;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					count++;
				}
			}	
			if (count == 0) 
			{
				break;
			}
		}

		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[arr.length - 1]);
	}	
}
