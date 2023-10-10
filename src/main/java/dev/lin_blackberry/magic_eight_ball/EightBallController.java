package dev.lin_blackberry.magic_eight_ball;

import java.io.IOException;

import javafx.fxml.FXML;

public class EightBallController {
	@FXML
	public void switchToEightBall() throws IOException {
		App.setRoot("eightball");
	}
}
