package com.golf.domain.skingame.comparator;

import com.golf.domain.skingame.SkinScorecard;


public class HoleNineComparator extends HoleComparator
{

	public int compare(SkinScorecard o1, SkinScorecard o2)
	{
		return getScore(o1.getNinthHole()).compareTo(getScore(o2.getNinthHole()));
	}
	


}
