package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


// TODO: Auto-generated Javadoc
/**
 * The Class HoleTenComparator.
 */
public class HoleTenComparator extends HoleComparator
{

    /**
     *  @param  o1  <code>SkinScorecard</code>
     *  @param  o2  <code>SkinScorecard</code>
     *  @return     <code>int</code> 
     */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getTenthHole()).compareTo(getScore(o2.getTenthHole()));
	}
	


}
