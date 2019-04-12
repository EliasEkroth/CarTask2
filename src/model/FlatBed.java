package model;
import javafx.scene.paint.Color;

public class FlatBed {
	
	public static int carBed = 0;
	private static boolean isOpen;
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}
	
	/*public int getBedAngle() {
		return carBed;
	}*/
	
	public int setBedAngle(int amount) {
		if(amount <= 70) {
			carBed = amount;
		}else if(amount < 0){
			carBed = 0;
		}
			return carBed;
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