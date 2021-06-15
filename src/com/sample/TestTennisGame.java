package com.sample;

import junit.framework.TestCase;

public class TestTennisGame extends TestCase {

	public TennisGame game = new TennisGame();
	
	public final void testLoveLove() {
		game.setScores(0, 0);
		String score = game.getScore();
		assertEquals("Love - Love", score);
	}
	
	public final void testLoveFifteen() {
		game.setScores(0, 1);
		String score = game.getScore();
		assertEquals("Love - Fifteen", score);
	}
	
	public final void testThirtyThirty() {
		game.setScores(2, 2);
		String score = game.getScore();
		assertEquals("Thirty - Thirty", score);
	}
	
	public final void testPlayer1Win() {
		game.setScores(6, 4);
		String score = game.getScore();
		assertEquals("Player 1 wins!", score);
	}
	
	public final void testPlayer1Win2() {
		game.setScores(4, 6);
		String score = game.getScore();
		assertEquals("Player 2 wins!", score);
	}
	
	public final void testDeuce() {
		game.setScores(3, 3);
		String score = game.getScore();
		assertEquals("Deuce", score);
	}

	public final void testPlayer1Advantage() {
		game.setScores(6, 5);
		String score = game.getScore();
		assertEquals("Player 1's Advantage", score);
	}
	
	public final void testPlayer2Advantage() {
		game.setScores(5, 6);
		String score = game.getScore();
		assertEquals("Player 2's Advantage", score);
	}
}
