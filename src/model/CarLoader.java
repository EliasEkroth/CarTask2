package model;
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CarLoader extends car{
	
	int capacity;
	static ArrayList<car> cars = new ArrayList<car>();
	private boolean isOpen;
	
	public CarLoader(int capacity) {
		capacity = this.capacity;
	}

	public void updateAllPositions(Vehicle v) {
		for (car car : cars) {
			car.setXPos(v.getXPos());
			car.setYPos(v.getYPos());
		}
	}
	
	public void loadCar(car c) {
		if(FlatBed.isOpen() && cars.size()<5) {
			cars.add(c);
		}
	}
	
	public void unloadLastCar(car c) {
		if(FlatBed.isOpen() && cars.size()>0 /*&& capacity != this*/) {
			cars.remove(cars.size()-1);
		}
	}
	
	public void unloadFirstCar(car c) {
		if(FlatBed.isOpen() && cars.size()>0 /*&& capacity != this*/) {
			cars.remove(cars.size[0]);
		}
	}
	
	private void open() {
		isOpen = true;
	}
	
	private void close() {
		isOpen = false;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
}