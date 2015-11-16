package com.golf.business.accessor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.golf.business.Accessor;
import com.golf.business.Filter;
import com.golf.domain.player.Player;
import com.golf.domain.tournament.Tournament;
import com.google.common.collect.Lists;

/**
 * Accessor for Player domain objects.
 */
@Service("playerAccessor")
public class PlayerAccessor implements Accessor<Player> {

	@Override
	public List<Player> find(Filter<Player> filter) {
		
		return Lists.newArrayList(new Player(1L, "Player 1"), new Player(2L, "Player 2"), new Player(3L, "Player 3"));
	}

	@Override
	public Player load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
