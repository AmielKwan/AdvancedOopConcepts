package com.ecpe205;

public class Fiction extends Book
{

	public Fiction(String t) 
	{
		super(t);
		setPrice();
		// TODO Auto-generated constructor stub
	}

	@Override
	void setPrice() {
		// TODO Auto-generated method stub
		price = 24.99;
	}

}
