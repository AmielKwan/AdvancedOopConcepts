package com.ecpe205;

public class UseGeometric
{
	public static void main(String[] args)
	{
		double area;
		double height;
		double width;
		String figuretype;
		
		GeometricFigure[] figure = new GeometricFigure[4];
		figure[0] = new Square(1, 1, "Square");
		figure[1] = new Triangle(2, 1, "Triangle");
		figure[2] = new Square(5, 5, "Square");
		figure[3]= new Triangle(3, 2, "Triangle");

		for(int i = 0; i < figure.length; i++)
		{
				height = figure[i].getheight();
				width = figure[i].getwidth();
				figuretype = figure[i].getfigure();
				area = figure[i].Area(height, width);
				System.out.println(figuretype + ", height: " +
				height + ", width: " + width + ", and area of: " + area);
		}
	}
}