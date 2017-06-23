package com.acadgild;

import java.util.Scanner;

public class Triangle extends Figure {

	public int returnBase(){
		System.out.println("Please enter base of the triangle:");
		Scanner scanBase=new Scanner(System.in);
		return scanBase.nextInt();
		
	}
	
	public int returnHeight(){
		
		System.out.println("Please enter height of the triangle:");
		Scanner scanHeight=new Scanner(System.in);
		return scanHeight.nextInt();
	}
	@Override
	public void findArea() {
		
	int base=returnBase();
	int height=returnHeight();
	
	double area=0.5*base*height;
	
	System.out.println("Area of Rectangle is:"+area);
		
	}

	@Override
	public void findPermeter() {
		System.out.println("Please enter 1st side of traiangle");
		Scanner scanFirst=new Scanner(System.in);
		int sideOne=scanFirst.nextInt();
		
		System.out.println("Please enter 2nd side of traiangle");
		Scanner scanSecond=new Scanner(System.in);
		int sideSecond=scanSecond.nextInt();
		
		System.out.println("Please enter 3rd side of traiangle");
		Scanner scanThird=new Scanner(System.in);
		int sideThird=scanThird.nextInt();
		
		double perimeter=sideOne+sideSecond+sideThird;
		
		System.out.println("Perimeter of the Triangle is:"+perimeter);
	}

	
	public static void main(String[] args){
		
		Triangle triangle=new Triangle();
		triangle.findArea();
		triangle.findPermeter();
	}
}
