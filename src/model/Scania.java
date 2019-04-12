package model;
import javafx.scene.paint.Color;

public class Scania extends car{

	private Scania() {
		color = Color.BLUE;
		enginePower = 730/*hp*/;
		modelName = "Scania R 730";
	}

	private int getBedAngle() {
		return FlatBed.carBed;
	}
	
	public void gas(int amount) {
		if(FlatBed.carBed == 0) {
		super.gas(amount);
		}
	}
	
}
