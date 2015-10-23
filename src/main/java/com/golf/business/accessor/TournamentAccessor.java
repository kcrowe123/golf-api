package com.golf.business.accessor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.golf.business.Accessor;
import com.golf.business.Filter;
import com.golf.domain.tournament.Tournament;
import com.google.common.collect.Lists;

/**
 * Accessor for Tournament domain objects.
 */
@Service("tournamentAccessor")
public class TournamentAccessor implements Accessor<Tournament> {

	
	@Override
	public List<Tournament> find(Filter<Tournament> filter) {	
		return Lists.newArrayList(new Tournament(1L, "Tournament1"), new Tournament(2L, "Tournament2"), new Tournament(3L, "Tournament3"));
	}

	@Override
	public Tournament load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
