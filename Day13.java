/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

import java.util.*;

/**
 *
 * @author sysvenkatesh
 */

abstract class Book 
{
    String title;
    String author;   
    Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }   
    abstract void display();
}

class MyBook extends Book {
    private int price;

    MyBook(String t, String a, int p) {
        super(t, a);
        price = p;
    }

    @Override
    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}

public class Day13 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        
        Book book = new MyBook(title, author, price);
        book.display();
    }
}
