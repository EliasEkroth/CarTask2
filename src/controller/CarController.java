package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import main.App;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;

	public CarController(CarPane cp) {
		
		ArrayList<Vehicle> models = new ArrayList<Vehicle>();

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if(Vehicle.getX()>App.WIDTH - 100 || Vehicle.getX()<0) {
					Vehicle.turnLeft();
					Vehicle.turnLeft();
					Vehicle.move();
					Vehicle.stopEngine();
				}
				
				if (model != null) {
					model.move();
					cp.move(Vehicle.getX(), Vehicle.getY());
					cp.update();
				}
			}
		};
		at.start();
	}

	public void addVehicle(Vehicle v) {
		Vehicle.getModelName().add(v);
	}
	
	public void setModel(Vehicle v) {
		model = v;
	}

	public void gas(double amount) {
		for (Vehicle vehicle : models) {
		model.gas(amount);
		System.out.println(Vehicle.getClass().getSimpleName() + " gas");
		}
	}

}
