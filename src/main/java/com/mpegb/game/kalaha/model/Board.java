package com.mpegb.game.kalaha.model;

import com.mpegb.game.kalaha.util.KalahaGameEnum;

/**
 * Represents the board which holds pits where the players accumulate the stones.
 *
 * @author Bhushan Mishra
 */

public class Board {
	
	private Pit[] pits;
	
	public Board() {
		this.pits = new Pit[KalahaGameEnum.NUMBER_OF_PITS.getValue()];
		for(int i=0; i<KalahaGameEnum.NUMBER_OF_PITS.getValue(); i++) {
			Pit pit = new Pit();
			pits[i] = pit;
            pits[i].setId(i);
			if(((i+1) % KalahaGameEnum.PITS_FOR_PLAYER.getValue()) == 0) {
				pits[i].setKalaha(true);
			} else {
				pits[i].setKalaha(false);
			}
			if(!pits[i].isKalaha()) {
				pits[i].setNoOfseeds(KalahaGameEnum.NUMBER_OF_SEEDS_PER_PIT.getValue());
			} else {
				pits[i].setNoOfseeds(0);
			}
		}
	}

	
	/**
	 * @return the pits
	 */
	public Pit[] getPits() {
		return pits;
	}


	/**
	 * @param pits the pits to set
	 */
	public void setPits(Pit[] pits) {
		this.pits = pits;
	}


	/*
	 * Returns pit by Id
	 */
    public Pit getPitById(int pitId) {
        return this.getPits()[pitId];
    }

}
