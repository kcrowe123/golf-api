package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleSixteenComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getSixteenthHole()).compareTo(getScore(o2.getSixteenthHole()));
	}
	


}
