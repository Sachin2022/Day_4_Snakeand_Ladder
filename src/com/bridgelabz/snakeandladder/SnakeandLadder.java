package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		int start = 0;
		int roll = 0;

		int diceValue = (int) Math.floor(Math.random() * 6) + 1;
		System.out.println("Dice value is :" + diceValue);

		int option = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Option is :" + option);

		switch (option) {
		case NO_PLAY:
			roll = roll;
			break;
		case LADDER:
			roll = +diceValue;
			break;
		case SNAKE:
			roll -= diceValue;
			if (roll < 0) {
				roll = 0;
			}
			break;
		}
		int position = (start + roll);
		System.out.println("Current Position:" + position);
	}

}
