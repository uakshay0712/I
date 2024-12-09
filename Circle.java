package inheretance;

import java.util.Scanner;

public class Circle extends Shape {
	
	public void getArea(double length, double width) {
		double area = length*width;
		System.out.println("Size of area: "+ area);
	}
	public void getPerimeter(double length, double width) {
		double perimeter =2*(length+width);
		System.out.println("Perimeter area: "+ perimeter);
		
	}


	public static void main(String[] args) {
//		Scanner scr = new Scanner(System.in);
//		System.out.print("Enter Length: ");
//		double length=scr.nextDouble();
//		System.out.print("Enter width: ");
//		double width =scr.nextDouble();
//		
		Shape s= new Circle();
		System.out.print("Area: ");
		s.getArea(10, 5);
		s.getPerimeter(10, 5);
		
		

	}

}
