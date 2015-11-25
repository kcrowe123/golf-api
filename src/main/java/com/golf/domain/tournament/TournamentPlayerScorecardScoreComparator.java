package com.golf.domain.tournament;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentPlayerScorecardScoreComparator.
 */
public class TournamentPlayerScorecardScoreComparator implements Comparator<TournamentPlayerScorecard>
{
	
	/** The high number. */
	private static final int HIGH_NUMBER = 9999;
	
    /**
     *  @param  o1  <code>TournamentPlayerScorecard</code>
     *  @param  o2  <code>TournamentPlayerScorecard</code>
     *  @return     <code>int</code> 
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
