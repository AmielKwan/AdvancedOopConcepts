package com.ecpe205;

public class Health extends Insurance
{
	public Health(String insurancetype, int monthlycost) {
		super("Health", monthlycost);
		setCost();
		// TODO Auto-generated constructor stub
	}

	@Override
	void setCost() {
		// TODO Auto-generated method stub
		monthlycost = 196;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Insurance type is: "+ getInsurancetype());
		System.out.println("With a monthly fee of: $"+ getMonthlycost());
	}

}