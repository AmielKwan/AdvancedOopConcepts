package com.ecpe205;

public class Life extends Insurance
{
	public Life(String insurancetype, int monthlycost) {
		super("Life", monthlycost);
		setCost();
		// TODO Auto-generated constructor stub
	}

	@Override
	void setCost() {
		// TODO Auto-generated method stub
		monthlycost = 36;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Insurance type is: "+ getInsurancetype());
		System.out.println("With a monthly fee of: $"+ getMonthlycost());
	}

}