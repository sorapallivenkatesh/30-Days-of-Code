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
class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) 
    {
        this.elements = elements;
    }

    public void computeDifference() 
    {
        int max = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int abs = Math.abs(elements[i] - elements[j]);
                if (abs > max) 
                    max = abs;
            }
        }

        maximumDifference = max;
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
