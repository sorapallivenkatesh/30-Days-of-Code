/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.util.Scanner;

/**
 *
 * @author sysvenkatesh
 */
public class Day11 
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int matrix[][] = new int[6][6];
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                if (j + 2 < 6 && i + 2 < 6) 
                {
                    sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] + matrix[i + 1][j + 1] + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                    if (sum > maxSum) 
                        maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);              
    }
    
}
