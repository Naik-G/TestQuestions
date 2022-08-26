package com.testquestions;

public class Car{
	int yearModel;
	String make;
	int speed;
	Car(String make, int yearModel){
		this.make = make;
		this.yearModel = yearModel;
		this.speed=0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void accelerate(){
		this.speed = this.speed+5;
	}

	void brake(){
		this.speed = this.speed-5;
	}
	
}
