package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleThreeComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getThirdHole()).compareTo(getScore(o2.getThirdHole()));
	}
	


}
