package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleThirteenComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getThirteenthHole()).compareTo(getScore(o2.getThirteenthHole()));
	}
	


}
