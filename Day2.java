/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;
import java.util.*;
import java.math.*;

/**
 *
 * @author sysvenkatesh
 */
public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip=mealCost*tipPercent/100;
        double tax=mealCost*taxPercent/100;
        double total=mealCost+tip+tax;
        // cast the result of the rounding operation to an int and save it as totalCost  
        int totalCost = (int) Math.round(total/*numberToRoundHere*/);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
      
        // Print your result
    }
} 
