package com.golf.domain.skingame.comparator;

import java.util.Comparator;

import com.golf.domain.skingame.Hole;
import com.golf.domain.skingame.SkinScorecard;

// TODO: Auto-generated Javadoc
/**
 * The Class HoleComparator.
 */
public abstract class HoleComparator implements Comparator<SkinScorecard>
{
	
	/** The high number. */
	private static int HIGH_NUMBER = 9999;
	
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public abstract int compare(SkinScorecard o1, SkinScorecard o2);
	
	/**
	 * Gets the score.
	 *
	 * @param hole the hole
	 * @return the score
	 */
	protected Integer getScore(Hole hole)
	{
		if(hole.getScore() == 0)
		{
			return Integer.valueOf(HIGH_NUMBER);
		}
		
		return Integer.valueOf(hole.getScore());
	}
}
