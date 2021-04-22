package com.ecpe205;

public class BookArray 
{
	public static void main(String[] args)
	{
		Book[] books = new Book[10];
		books[0] = new Fiction ("Fictional: Maze Runner");
		books[1] = new Fiction ("Fictional: All the Light We Cannot See");
		books[2] = new Fiction ("Fictional: One Hundred Years of Solitude");
		books[3] = new Fiction ("Fictional: The Hobbit");
		books[4] = new Fiction ("Fictional: Crime and Punishment");
		books[5] = new NonFiction ("NonFictional: Holy Bible");
		books[6] = new NonFiction ("NonFictional: A Brief History of Time");
		books[7] = new NonFiction ("NonFictional: I Know Why the Caged Bird Sings");
		books[8] = new NonFiction ("NonFictional: In Cold Blood");
		books[9] = new NonFiction ("NonFictional: Bury My Heart at Wounded Knee");
		
		for(int i = 0; i < books.length; i++)
		{
			System.out.println(books[i].getTitle() + " for $" + books[i].getPrice());
		}
	}
}
