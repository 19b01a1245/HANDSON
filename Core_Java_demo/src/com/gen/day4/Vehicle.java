package com.gen.day4;

	class Vehicle {
	    String make;
	    String model;
	    int year;
	    String fuelType;

	    
	    public Vehicle(String make, String model, int year, String fuelType) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.fuelType = fuelType;
	    }

	    
	    public double calculateFuelEfficiency() {
	        // Implement the logic to calculate fuel efficiency based on vehicle type
	        // For example, miles per gallon (mpg) for cars, or miles per liter (mpl) for trucks/motorcycles.
	        return 0.0;
	    }

	    // Method to calculate distance traveled
	    public double calculateDistanceTraveled(double fuelConsumed) {
	        // Implement the logic to calculate distance traveled based on fuel consumed and fuel efficiency.
	        return 0.0;
	    }

	    
	    public int getMaxSpeed() {
	        
	        return 0;
	    }
	}
	 
	class Truck extends Vehicle {
	    

	   
	    public Truck(String make, String model, int year, String fuelType) {
	        super(make, model, year, fuelType);
	    }

	    
	}

	
	class Car extends Vehicle {
	    

	    
	    public Car(String make, String model, int year, String fuelType) {
	        super(make, model, year, fuelType);
	    }
	}
