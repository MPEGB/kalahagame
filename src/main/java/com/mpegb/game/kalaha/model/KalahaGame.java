package com.mpegb.game.kalaha.model;

/**
 * This is the main class used to instantiate the game.
 *
 * @author Bhushan Mishra
 */
public class KalahaGame {
	
	private Player player1;
	private Player player2;
	private Board board;
    private String message;
	
	
	public KalahaGame() {
		this.board = new Board();
		this.player1 = new Player();
		this.player2 = new Player();
		player1.setPlayerNumber(1);
		player2.setPlayerNumber(2);
		player1.setActive(true);
		player2.setActive(false);
	}


	/**
	 * @return the player1
	 */
	public Player getPlayer1() {
		return player1;
	}


	/**
	 * @param player1 the player1 to set
	 */
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}


	/**
	 * @return the player2
	 */
	public Player getPlayer2() {
		return player2;
	}


	/**
	 * @param player2 the player2 to set
	 */
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}


	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}


	/**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * Returns active player
	 */
	public Player getActivePlayer() {
        return player1.isActive() ? player1 : player2;
    }

}
