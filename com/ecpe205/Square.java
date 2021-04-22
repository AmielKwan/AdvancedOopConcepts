package com.ecpe205;

public class Square extends GeometricFigure
{
	private double area;
	
	public Square(double height, double width, String figure)
	{
		super(height, width, figure);
	}
	public double Area(double height, double weight)
	{
			area = (height*weight);
			return area;
	}
}