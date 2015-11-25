package com.golf.domain.skingame;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinScorecardComparator.
 */
public class SkinScorecardComparator implements Comparator<SkinScorecard>
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return o1.getPlayer().getFullName().compareTo(o2.getPlayer().getFullName());
	}

}
