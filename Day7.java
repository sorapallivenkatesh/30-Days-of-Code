/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.io.*;
import java.util.*;

/**
 *
 * @author sysvenkatesh
 */

public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
         int[] arrr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = in.nextInt();
            arrr[n-1-i]=arr[i];
        }
        for(int i=0; i < n; i++)
        {
            System.out.print(arrr[i]+" ");
        }
        in.close();
    }
}
