package com.acadgild;

import java.util.Scanner;

public class Rectangle extends Figure {

	public int returnWidth(){
		System.out.println("Please enter width of the rectangle:");
		Scanner scanWidth=new Scanner(System.in);
		return scanWidth.nextInt(); 
	}
	
	public int returnHeight(){
		System.out.println("Please enter height of the rectangle:");
		Scanner scanHeight=new Scanner(System.in);
		return scanHeight.nextInt(); 
	}
	
	@Override
	public void findArea() {
		
		int width=returnWidth();
		int height=returnHeight();
		
		double area=width*height;
		System.out.println("Area of the Rectangle is:"+area);
	}

	@Override
	public void findPermeter() {
		
		int width=returnWidth();
		int height=returnHeight();
		
		double perimeter=(2*width)+(2*height);
		System.out.println("Perimeter of the Rectangle is:"+perimeter);
		
	}

	
	public static void main(String[] args){
		
		Rectangle rectangle=new Rectangle();
		rectangle.findArea();
		rectangle.findPermeter();
	}
}
