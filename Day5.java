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
public class Day5 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=10;i++)
        {
            int result=1;
            result=n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}

