package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleFourComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getFourthHole()).compareTo(getScore(o2.getFourthHole()));
	}
	


}
