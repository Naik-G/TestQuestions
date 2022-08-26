package com.testquestions;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Bat Mobile",1965);
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
			
	}

}
