/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author sysvenkatesh
 */
public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
       /* Declare second integer, double, and String variables. */
        Scanner sc=new Scanner(System.in);
       
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int j=sc.nextInt();
        double dd=sc.nextDouble();
        String ss=sc.next();
        ss += sc.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the double variables on a new line. */
		 System.out.println(d+dd);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
         System.out.println(s+ss);
    }
}
