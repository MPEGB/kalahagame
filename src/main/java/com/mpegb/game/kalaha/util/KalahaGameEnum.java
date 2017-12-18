package com.mpegb.game.kalaha.util;

/**
*
* Represents initial amount of stones used per pit and pits for player.
*
* @author Bhushan Mishra
*/


public enum KalahaGameEnum {
	
	NUMBER_OF_SEEDS_PER_PIT(6),
	NUMBER_OF_PITS(14),
	PITS_FOR_PLAYER(7);
	
	private final int value;
	
	private KalahaGameEnum(int noOfPits) {
		this.value = noOfPits;
	}

	public int getValue() {
		return value;
	}
	
}
