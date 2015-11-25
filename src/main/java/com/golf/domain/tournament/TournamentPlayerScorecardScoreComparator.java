package com.golf.domain.tournament;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentPlayerScorecardScoreComparator.
 */
public class TournamentPlayerScorecardScoreComparator implements Comparator<TournamentPlayerScorecard>
{
	
	/** The high number. */
	private static double HIGH_NUMBER = 9999;
	
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(TournamentPlayerScorecard o1, TournamentPlayerScorecard o2)
	{	
		return getScore(o1).compareTo(getScore(o2));
	}

	/**
	 * Gets the score.
	 *
	 * @param scorecard the scorecard
	 * @return the score
	 */
	private Double getScore(TournamentPlayerScorecard scorecard)
	{
		Double score;
		try
		{
			score = Double.valueOf(scorecard.getTwoDayHandicapTotal());
		} 
		catch (Exception e)
		{
			score = Double.valueOf(HIGH_NUMBER);
		}
		
		return score;
		
	}

}
