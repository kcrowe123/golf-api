package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


// TODO: Auto-generated Javadoc
/**
 * The Class HoleSevenComparator.
 */
public class HoleSevenComparator extends HoleComparator
{

    /**
     *  @param  o1  <code>SkinScorecard</code>
     *  @param  o2  <code>SkinScorecard</code>
     *  @return     <code>int</code> 
     */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getSeventhHole()).compareTo(getScore(o2.getSeventhHole()));
	}
	


}
