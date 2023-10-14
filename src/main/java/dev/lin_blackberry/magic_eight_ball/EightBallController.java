package dev.lin_blackberry.magic_eight_ball;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class EightBallController {
	@FXML
	private Text label;
	
	@FXML
	private Circle labelBall;
	
	private final Map<Integer, String> possibleAnswers;

	public EightBallController() {
		possibleAnswers = new HashMap<>();
		possibleAnswers.put(0, "Yes");
		possibleAnswers.put(1, "Signs point to yes");
		possibleAnswers.put(2, "Outlook good");
		possibleAnswers.put(3, "Most likely");
		possibleAnswers.put(4, "As I see it, yes");
		possibleAnswers.put(5, "You may rely on it");
		possibleAnswers.put(6, "Yes definitely");
		possibleAnswers.put(7, "Without a doubt");
		possibleAnswers.put(8, "It is decidedly so");
		possibleAnswers.put(9, "It is certain");
		possibleAnswers.put(10, "Reply hazy, try again");
		possibleAnswers.put(11, "Ask again later");
		possibleAnswers.put(12, "Better not tell you now");
		possibleAnswers.put(13, "Cannot predict now");
		possibleAnswers.put(14, "Signs point to yes");
		possibleAnswers.put(15, "Concentrate and ask again");
		possibleAnswers.put(16, "Don’t count on it");
		possibleAnswers.put(17, "My reply is no");
		possibleAnswers.put(18, "My sources say no");
		possibleAnswers.put(19, "Outlook not so good");
		possibleAnswers.put(20, "Very doubtful");
	}

	@FXML
	public void resetEightBall() throws IOException {
		label.setText("8");
		label.getStyleClass().remove("answer");
		labelBall.getStyleClass().remove("shaken");
	}

	@FXML
	public void shakeTheBall() throws IOException {
		String a = getAnswer();
		System.out.println(a);
		label.setText(a);
		label.getStyleClass().add("answer");
		labelBall.getStyleClass().add("shaken");
		

	}

	private String getAnswer() {
		Random random = new Random();
		return possibleAnswers.get(random.nextInt(possibleAnswers.size()) - 1);
	}


}
