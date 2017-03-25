/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

/**
 *
 * @author sysvenkatesh
 */
public class Day4 {
    private int age;	
  
	public Day4(int initialAge) 
        {
  		// Add some more code to run some checks on initialAge
        if(initialAge<1)
        {
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
        {
            age=initialAge;
        }
	}

	public void amIOld() 
        {
  	if(age<13)
        {
             System.out.println("You are young.");
         }
        else if(age>=13 && age<18)
        {
             System.out.println("You are a teenager.");
        }
        else
        {
             System.out.println("You are old.");
         }
	}

	public void yearPasses() 
        {
  		// Increment this person's age.
        age++;     
	}
} 

