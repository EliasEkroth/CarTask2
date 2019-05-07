package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private double volvoXPos, saabXPos;
	private double volvoYPos, saabYPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
	}

	public void move(double x, double y) {
		volvoXPos = x;
		volvoYPos = y;
	}

	public void update() {
		volvoImage.setX(volvoXPos);
		volvoImage.setTranslateY(volvoYPos);
	}

}
