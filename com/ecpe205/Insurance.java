package com.ecpe205;

public abstract class Insurance 
{
	public String insurancetype;
	public int monthlycost;
	
	public Insurance (String insurancetype, int monthlycost)
	{
		this.insurancetype = insurancetype;
		this.monthlycost = monthlycost;
	}
	public String getInsurancetype() 
	{
		return insurancetype;
	}
	public int getMonthlycost() 
	{
		return monthlycost;
	}
	
	abstract void setCost();
	abstract void display();
}