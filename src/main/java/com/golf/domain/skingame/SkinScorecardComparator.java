package com.golf.domain.skingame;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinScorecardComparator.
 */
public class SkinScorecardComparator implements Comparator<SkinScorecard>
{

    /**
     *  @param  o1  <code>SkinScorecard</code>
     *  @param  o2  <code>SkinScorecard</code>
     *  @return     <code>int</code> 
     */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return o1.getPlayer().getFullName().compareTo(o2.getPlayer().getFullName());
	}

}
