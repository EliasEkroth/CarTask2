package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import main.App;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;
	ArrayList<Vehicle> models = new ArrayList<Vehicle>();

	public CarController(CarPane cp) {

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if(Vehicle.getX()>App.WIDTH - 100 || Vehicle.getX()<0) {
					model.turnLeft();
					model.turnLeft();
					model.move();
					model.stopEngine();
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
		models.add(v.getModelName());
	}
	
	public void setModel(Vehicle v) {
		model = v;
	}

	public void gas(double amount) {
		for (Vehicle vehicle : models) {
		model.gas(amount);
		System.out.println(vehicle.getClass().getSimpleName() + " gas");
		}
	}

}
