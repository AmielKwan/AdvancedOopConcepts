package com.ecpe205;

public class UseBook 
{
	public static void main (String [] args)
	{
		Book books;
		books = new Fiction ("Maze Runner");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
		books = new NonFiction ("Holy Bible");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
	}
}
