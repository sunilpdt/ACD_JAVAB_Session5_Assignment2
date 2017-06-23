package com.acadgild;

import java.util.Scanner;

public class Circle extends Figure {

	public int returnRadius(){
		System.out.println("Please enter radius of the circle:");
		Scanner scanRadius=new Scanner(System.in);
		return scanRadius.nextInt(); 
	}
	
	@Override
	public void findArea() {
		
		int radius=returnRadius();
		double area=2*3.14*(radius*radius);
		System.out.println("Area of the circle is:"+area);
		
	}

	@Override
	public void findPermeter() {
		int radius=returnRadius();
		double area=2*3.14*radius;
		System.out.println("Perimeter of the circle is:"+area);
	}

	public static void main(String[] args){
		
		Circle c=new Circle();
		c.findArea();
		c.findPermeter();
	}
}
