package com.golf.business.accessor;

import java.util.List;

import com.golf.domain.player.Player;

public interface PlayerService {
	
	public List<Player> getAllPlayers() throws Exception;

}
