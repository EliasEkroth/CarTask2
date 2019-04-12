package model;
import javafx.scene.paint.Color;

public class FlatBed {
	
	private int carBed = 0;
	private static boolean isOpen;
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}
	
	public static boolean isOpen() {
		return isOpen;
	}
	
	private void raiseBed() {
		carBed++;
		if(carBed > 70) {
			carBed = 70;
		}
	}

	private void lowerBed() {
		carBed--;
		if(carBed < 0) {
			carBed = 0;
		}
	}
	
}