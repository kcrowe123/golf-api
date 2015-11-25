package com.golf.domain.tournament;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentPlayerScorecardComparator.
 */
public class TournamentPlayerScorecardComparator implements Comparator<TournamentPlayerScorecard>
{

    /**
     *  @param  o1  <code>TournamentPlayerScorecard</code>
     *  @param  o2  <code>TournamentPlayerScorecard</code>
     *  @return     <code>int</code> 
     */
	public int compare(TournamentPlayerScorecard o1, TournamentPlayerScorecard o2)
	{
		String fullName1 = o1.getPlayer().getFullName();
		String fullName2 = o2.getPlayer().getFullName();
		
		return fullName1.compareTo(fullName2);
	}

}
