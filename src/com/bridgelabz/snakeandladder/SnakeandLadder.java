package com.bridgelabz.snakeandladder;

public class SnakeandLadder {
	final static int NO_OF_PLAYER = 1;
	final static int START_POSITION = 0;

	public static void main(String[] args) {

		System.out.println("Welcome To Snake And Ladder Game");
		int position = 0;

		int diceValue = (int) Math.floor(Math.random() * 6) + 1;
		System.out.println("Player start position : " + position);
		System.out.println("Number of player is:" + NO_OF_PLAYER);
		System.out.println("Player rolls the dice and get :" + diceValue);

	}

}
