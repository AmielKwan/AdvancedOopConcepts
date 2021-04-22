package com.ecpe205;

public abstract class GeometricFigure 
{
	private double height;
	private double width;
	private String figure;
	
	public GeometricFigure(double height, double width, String figure)
	{
		this.height = height;
		this.width = width;
		this.figure = figure;
	}
		public double getheight()
		{
			return height;
		}
		public void setheight(double height) 
		{
			this.height = height;
		}
		public double getwidth() 
		{
			return width;
		}
		public void setwidth(double width) 
		{
			this.width = width;
		}
		public String getfigure() {
			return figure;
		}
		public void setfigure(String figure) 
		{
			this.figure = figure;
		}
		public abstract double Area(double height, double weight);
}