/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.util.Scanner;

/**
 *
 * @author S Y S Venkatesh
 */
public class Day16 
{
     public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);
        String S = in.next();
         try 
         {
           int str_to_int=Integer.parseInt(S);
           System.out.println(str_to_int);
         }
         catch (Exception e) 
         {
             System.out.println("Bad String");  
         }
    }
}
