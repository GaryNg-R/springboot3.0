package com.spring.learning.learningspringframework.game;

public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
    }
}
