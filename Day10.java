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
public class Day10 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0, max = 0;
        while (num > 0) 
        {
            if (num % 2 == 1) 
            {
                count++;
                if (count > max) 
                {
                    max = count;
                }
            } 
            else 
            {
                count = 0;
            }
            num = num / 2;
        }
        System.out.println(max);
    }
} 
