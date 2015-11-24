package com.golf.business.accessor.tournament;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golf.business.Accessor;
import com.golf.business.Filter;
import com.golf.dao.tournament.TournamentDao;
import com.golf.domain.tournament.Tournament;

/**
 * Accessor for Tournament domain objects.
 */
@Service("tournamentAccessor")
public class TournamentAccessor implements Accessor<Tournament> {

	  @Autowired
	  private TournamentDao tournamentDao;
	
	@Override
	public List<Tournament> find(Filter<Tournament> filter) {	
		//return Lists.newArrayList(new Tournament(1L, "Tournament1"), new Tournament(2L, "Tournament2"), new Tournament(3L, "Tournament3"));
		return tournamentDao.getAll();
	}

	@Override
	public Tournament load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
