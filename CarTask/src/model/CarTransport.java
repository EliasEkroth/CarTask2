package model;
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CarTransport extends Vehicle {
	
	FlatBed FlatBed;
	CarLoader loader;
	ArrayList<car> cars = new ArrayList<car>();
	int capacity = 5;
	
	public void loadCar(car c) {
		if(FlatBed.isOpen() && cars.size()<5) {
			cars.add(c);
		}
	}
	
	public void unloadCar(car c) {
		if(FlatBed.isOpen() && cars.size()>0 && capacity != this) {
			cars.remove(cars.size()-1);
		}
	}
	
	private CarTransport() {
		color = Color.WHITE;
		enginePower = 600/*hp*/;
		modelName = "Transport";
	}
	
	public void gas(double amount) {
		if(!FlatBed.isOpen()) {
		super.gas(amount);
		}
	}

	public void move() {
		super.move();
		CarLoader.updateAllPositions();
	}
	
}