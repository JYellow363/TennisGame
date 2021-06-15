package com.sample;

public class TennisGame {

	private int player1Score;
	private int player2Score;

	public TennisGame() {
		this.player1Score = 0;
		this.player2Score = 0;
	}

	public String getScore() {

		// Winner
		if (player2Score >= 4 && player2Score >= player1Score + 2)
			return "Player 2 wins!";
		if (player1Score >= 4 && player1Score >= player2Score + 2)
			return "Player 1 wins!";

		// Advantage
		if (player1Score >= 4 && player1Score == player2Score + 1)
			return "Player 1's Advantage";
		if (player2Score >= 4 && player2Score == player1Score + 1)
			return "Player 2's Advantage";

		// Deuce
		if (player2Score == player1Score && player1Score >= 3)
			return "Deuce";

		return getSimpleScore(player1Score) + " - " + getSimpleScore(player2Score);
	}

	private String getSimpleScore(int score) {
		switch (score) {
		case 0:
			return "Love";
		case 1:
			return "Fifteen";
		case 2:
			return "Thirty";
		case 3:
			return "Forty";
		}
		return "Error";
	}

	public void addPoint(int player) {
		switch (player) {
		case 1:
			player1Score++;
		case 2:
			player2Score++;
		}
	}

	public void setScores(int player1Score, int player2Score) {
		this.player1Score = player1Score;
		this.player2Score = player2Score;
	}
}
