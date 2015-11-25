package com.golf.domain.tournament;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentPlayerScorecardComparator.
 */
public class TournamentPlayerScorecardComparator implements Comparator<TournamentPlayerScorecard>
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(TournamentPlayerScorecard o1, TournamentPlayerScorecard o2)
	{
		String fullName1 = o1.getPlayer().getFullName();
		String fullName2 = o2.getPlayer().getFullName();
		
		return fullName1.compareTo(fullName2);
	}

}
