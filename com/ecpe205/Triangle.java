package com.ecpe205;

public class Triangle extends GeometricFigure
{
	private double area;
	
	public Triangle(double height, double width, String figure)
	{
		super(height, width, figure);
	}
	public double Area(double height, double weight)
	{
			area = ((height*weight)/2);
			return area;
	}
}