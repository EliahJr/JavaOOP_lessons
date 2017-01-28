package com.gmail.les1;

class Car {
private	String color;
private	double weight;
private	int year;
private double velosity = 0;


public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getVelosity() {
	return velosity;
}

public Car() {
	super();
}

public Car(String color, double weight, int year) {
	super();
	this.color = color;
	this.weight = weight;
	this.year = year;
}

/*
	public Car() {		
		super();
	}

	public Car(String color, double weight, int year) {
		this.color = color;
		this.weight = weight;
		this.year = year;
		print();
	}*/

	void beep() {
		System.out.println("BEEP-BEEP!!!");
	}

	void acceleration(double a) {
		velosity = velosity + a;
	}

	void deceleration(double b) {
		if (velosity - b >= 0)
			velosity = velosity - b;
	}

	void print() {
		System.out.println("Color: " + color);
		System.out.println("Weight: " + weight);
		System.out.println("Year car: " + year);
		System.out.println("Velosity: " + velosity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [color=");
		builder.append(color);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", year=");
		builder.append(year);
		builder.append(", velosity=");
		builder.append(velosity);
		builder.append("]");
		return builder.toString();
	}


}