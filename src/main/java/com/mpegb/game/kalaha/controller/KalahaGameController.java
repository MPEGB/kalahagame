package com.mpegb.game.kalaha.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mpegb.game.kalaha.model.KalahaGame;
import com.mpegb.game.kalaha.service.KalahaGameService;
import com.mpegb.game.kalaha.util.KalahaGameEnum;

/**
 * Represent kalaha game request controller
 * 
 * @author Bhushan Mishra
 */
@Controller
public class KalahaGameController {

    @Resource(name = "kalahaGameService")
    private KalahaGameService kalahaGameService;

    KalahaGame game;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String startGame(Model model) {
		game = new KalahaGame(); 
		model.addAttribute("game", game);
        model.addAttribute("rowLength", KalahaGameEnum.PITS_FOR_PLAYER.getValue());
        model.addAttribute("totalPits", KalahaGameEnum.NUMBER_OF_PITS.getValue());
		return "game";
	}
	
	@RequestMapping(value = "/move.do", method = RequestMethod.GET)
	public String move(@RequestParam String pitId, Model model) {
        int clickedPitId = Integer.valueOf(pitId).intValue();
        game = kalahaGameService.startTheGame(clickedPitId, game);
        model.addAttribute("game", game);
        model.addAttribute("rowLength", KalahaGameEnum.PITS_FOR_PLAYER.getValue());
        model.addAttribute("totalPits", KalahaGameEnum.NUMBER_OF_PITS.getValue());
        model.addAttribute("message", game.getMessage());
        return "game";
	}

}