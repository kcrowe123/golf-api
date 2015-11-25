package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


// TODO: Auto-generated Javadoc
/**
 * The Class HoleThreeComparator.
 */
public class HoleThreeComparator extends HoleComparator
{

    /**
     *  @param  o1  <code>SkinScorecard</code>
     *  @param  o2  <code>SkinScorecard</code>
     *  @return     <code>int</code> 
     */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getThirdHole()).compareTo(getScore(o2.getThirdHole()));
	}
	


}
