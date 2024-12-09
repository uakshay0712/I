package inheretance;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	public void getArea(double length, double width) {
		double area = length*width;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length=scr.nextInt();
		System.out.print("Enter Width: ");
		double width=scr.nextDouble();
		Shape s= new Rectangle();
		System.out.print("Area: ");
		s.getArea(length,width);

	}

}
