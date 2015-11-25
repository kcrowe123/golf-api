package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


// TODO: Auto-generated Javadoc
/**
 * The Class HoleTwoComparator.
 */
public class HoleTwoComparator extends HoleComparator
{

	/* (non-Javadoc)
	 * @see com.golf.domain.skingame.comparator.HoleComparator#compare(com.golf.domain.skingame.SkinScorecard, com.golf.domain.skingame.SkinScorecard)
	 */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getSecondHole()).compareTo(getScore(o2.getSecondHole()));
	}
	


}
