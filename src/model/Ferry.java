package model;

import javafx.scene.paint.Color;
import javafx.scene.Group;

public class Ferry extends Vehicle {
	
	CarLoader loader;
	CarTransport transport;
	FlatBed flatbed;
	
	public void loadCar(car c) {
		if(FlatBed.isOpen()) {
			CarLoader.cars.add(c);
		}
	}
	
	public void unloadCar(car c) {
		if(FlatBed.isOpen()) {
			CarLoader.cars.remove(CarLoader.cars.size()-1);
		}
	}
	
}