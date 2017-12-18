package com.mpegb.game.kalaha.model;

import com.mpegb.game.kalaha.util.KalahaGameEnum;

/**
*
* Represents a pit of the board.
*
* @author Bhushan Mishra
 */

public class Pit {
	
	private int noOfseeds;
    private int id;
	private boolean isKalaha;
	private boolean isEmpty;
	
	public Pit() {
        this.noOfseeds = KalahaGameEnum.NUMBER_OF_SEEDS_PER_PIT.getValue();
	}

	/**
	 * @return the noOfseeds
	 */
	public int getNoOfseeds() {
		return noOfseeds;
	}

	/**
	 * @param noOfseeds the noOfseeds to set
	 */
	public void setNoOfseeds(int noOfseeds) {
		this.noOfseeds = noOfseeds;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the isKalaha
	 */
	public boolean isKalaha() {
		return isKalaha;
	}

	/**
	 * @param isKalaha the isKalaha to set
	 */
	public void setKalaha(boolean isKalaha) {
		this.isKalaha = isKalaha;
	}

	/**
	 * @return the isEmpty
	 */
	public boolean isEmpty() {
		return isEmpty;
	}

	/**
	 * @param isEmpty the isEmpty to set
	 */
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
}
