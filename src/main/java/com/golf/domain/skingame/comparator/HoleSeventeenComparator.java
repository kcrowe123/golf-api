package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleSeventeenComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getSeventeenthHole()).compareTo(getScore(o2.getSeventeenthHole()));
	}
	


}
