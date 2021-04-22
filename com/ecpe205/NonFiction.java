package com.ecpe205;

public class NonFiction extends Book
{

	public NonFiction(String t) 
	{
		super(t);
		setPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
	void setPrice() {
		// TODO Auto-generated method stub
		price = 37.99;
	}

}
