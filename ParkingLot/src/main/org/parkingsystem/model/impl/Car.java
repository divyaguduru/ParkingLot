package main.org.parkingsystem.model.impl;

import main.org.parkingsystem.model.Vehicle;

public class Car extends Vehicle{

	String color;
	String vehicleNumber;
	
	 
	public Car(String carno,String color) {
	    this.vehicleNumber=carno;
	    this.color = color;    
	}
	 
	public String getCarno() {
	    return vehicleNumber;
	}
	 
	public String getColor() {
	    return color;
	} 
	 
}
