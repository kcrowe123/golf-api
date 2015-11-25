package com.golf.domain.tournament;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentScoreboardFlightComparator.
 */
public class TournamentScoreboardFlightComparator implements Comparator<TournamentScoreboard>
{
	
	/**
	 *  (non-Javadoc).
	 *
	 * @param o1 the o1
	 * @param o2 the o2
	 * @return the int
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(TournamentScoreboard o1, TournamentScoreboard o2)
	{
		
		String flight1 = o1.getFlight().getName();
		String flight2 = o2.getFlight().getName();
		
		return flight1.compareTo(flight2);
	}
}
