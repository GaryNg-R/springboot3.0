package com.spring.learning.learningspringframework;

import com.spring.learning.learningspringframework.game.GameRunner;
import com.spring.learning.learningspringframework.game.GamingConsole;
import com.spring.learning.learningspringframework.game.MarioGame;
import com.spring.learning.learningspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringFrameworkApplication.class, args);
		GamingConsole game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
