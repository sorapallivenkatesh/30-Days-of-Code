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
public class Day6 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=1;k<=n;k++)
        {
          String st=sc.next();
          int len=st.length();
          for(int i=0;i<len;i+=2)
          {
             System.out.print(st.charAt(i));  
          }
            System.out.print(" ");
           for(int i=1;i<len;i+=2)
          {
             System.out.print(st.charAt(i)); 
          }
            System.out.println();
        }
        
    }
}
