package com.corejava.practice;


class Car{
	
	//properties
	String color; //null
	String type; //null
	String company; //null
	double price; //0.0
	
	//default constructor
	Car(){
	
		color = "silver";
		type = "Petrol";
		company = "Honda";
		price = 1000000;
	
		
	}
	
	
	//drive
	void drive() {
		
		System.out.println("I am driving a car");
		
		System.out.println("Color:"+color);
		System.out.println("Type:"+type);
		System.out.println("Company:"+company);
		System.out.println("Price:"+price);
		
	}
	
}


public class CarDemo {
	
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();

	}

}
