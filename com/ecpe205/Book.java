package com.ecpe205;

public abstract class Book 
{
	public String title;
	public double price;
	
	public Book(String t)
	{
		title = t;
	}
	public double getPrice() 
	{
		return price;
	}
	public String getTitle() 
	{
		return title;
	}
	abstract void setPrice();
}
