package com.golf.business.accessor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.golf.business.Accessor;
import com.golf.business.Filter;
import com.golf.domain.player.Player1;
import com.golf.domain.tournament.Tournament;
import com.google.common.collect.Lists;

/**
 * Accessor for Player domain objects.
 */
@Service("playerAccessor")
public class PlayerAccessor implements Accessor<Player1> {

	@Override
	public List<Player1> find(Filter<Player1> filter) {
		
		return Lists.newArrayList(new Player1(1L, "Player 1"), new Player1(2L, "Player 2"), new Player1(3L, "Player 3"));
	}

	@Override
	public Player1 load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
