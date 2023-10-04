package com.spring.learning.learningspringframework;

import com.spring.learning.learningspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringFrameworkApplication.class, args);

		// GamingConsole game = new SuperContraGame();
		//GamingConsole game = new MarioGame();
		//GamingConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner(game);
		//runner.run();
		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();
	}

}
