package pkg30daysofcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by S Y S Venkatesh on 3/25/2017.
 */
public class Day18
{
    private Deque<Character> stack;
    private Queue<Character> queue;
    
    public Day18() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }
    
    public void enqueueCharacter(char c) {
        queue.add(Character.valueOf(c));
    }
    
    public void pushCharacter(char c) {
        stack.push(Character.valueOf(c));
    }
    
    public char popCharacter() {
        return stack.pop().charValue();
    }
    
    public char dequeueCharacter() {
        return queue.poll().charValue();
    }
    
  public static void main(String args[])
  {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object: write Solution instead of Day18
        //write Solution instead of Day18
        //write Solution instead of Day18
        //write Solution instead of Day18
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
  
}
