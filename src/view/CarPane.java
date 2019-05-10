package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView saabImage;
	private double volvoXPos, saabXPos;
	private double volvoYPos, saabYPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().add(saabImage);
	}

	public void move(double x, double y) {
		if (model == "Volvo740") {
			volvoXPos = x;
			volvoYPos = y;
		}else if(model == "Saab95") {
			saabXPos = x;
			saabYPos = y;
		}
		
	}

	public void update() {
		volvoImage.setX(volvoXPos);
		volvoImage.setTranslateY(volvoYPos);
		saabImage.setX(saabXPos);
		saabImage.setTranslateY(saabYPos);
	}

}
