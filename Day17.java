/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.util.*;
import java.io.*;

/**
 *
 * @author S Y S Venkatesh
 */
class Calculator
{
    public int power(int n, int p) throws Exception 
    {
        if (n < 0 || p < 0)
                throw new Exception("n and p should be non-negative");
              //throw new Exception();
        return (int) Math.pow(n, p);   
    }
}
public class Day17 
{
        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                //System.out.println("n and p should be non-negative");
            }
        }
        in.close();
    }
}
