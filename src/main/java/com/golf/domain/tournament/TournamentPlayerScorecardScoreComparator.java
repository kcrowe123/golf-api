package com.golf.domain.tournament;

import java.util.Comparator;

public class TournamentPlayerScorecardScoreComparator implements Comparator<TournamentPlayerScorecard>
{
	private static double HIGH_NUMBER = 9999;
	
	public int compare(TournamentPlayerScorecard o1, TournamentPlayerScorecard o2)
	{	
		return getScore(o1).compareTo(getScore(o2));
	}

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
