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
	private static final int HIGH_NUMBER = 9999;
	
    /**
     *  @param  o1  <code>SkinScorecard</code>
     *  @param  o2  <code>SkinScorecard</code>
     *  @return     <code>int</code> 
     */
	public abstract int compare(SkinScorecard o1, SkinScorecard o2);
	
	/**
	 * Gets the score.
	 *
	 * @param hole the hole
	 * @return the score
	 */
	protected Integer getScore(Hole hole) {
		if (hole.getScore() == 0) {
			return Integer.valueOf(HIGH_NUMBER);
		}
		
		return Integer.valueOf(hole.getScore());
	}
}
