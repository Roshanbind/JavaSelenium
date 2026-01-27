package Inheritance_Overriding_concept;

public class RunnerClass {

	public static void main(String[] args) {
		Bus	bus=new Bus();//method load parent then child
		//bus.start();
		bus.refuel();
		bus.stop();
		bus.horn();
		Bike bike=new Bike();
		bike.start();//child
		
	Vehicle vehicle	=new Bike();//p+c
	vehicle.stop();
	//vehicle.start();
		
	}

}
