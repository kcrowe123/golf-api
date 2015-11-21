package com.golf.controller.tournament;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.golf.business.accessor.PlayerService;
import com.golf.domain.player.Player;

@RestController
public class PlayerController {
	
	@Inject
	private PlayerService playerService;

	 @RequestMapping(value="/players")
	 @ResponseBody
	 public List<Player> getAll() {
		List<Player> playerList = null;
	    try {
	    	playerList = playerService.getAllPlayers();
	    }
	    catch(Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	    return playerList;
	  }


    
}
