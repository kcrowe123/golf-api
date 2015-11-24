package com.golf.domain.skingame.comparator;

import java.util.Comparator;

import com.golf.domain.skingame.Hole;
import com.golf.domain.skingame.SkinScorecard;

public abstract class HoleComparator implements Comparator<SkinScorecard>
{
	private static int HIGH_NUMBER = 9999;
	
	public abstract int compare(SkinScorecard o1, SkinScorecard o2);
	
	protected Integer getScore(Hole hole)
	{
		if(hole.getScore() == 0)
		{
			return Integer.valueOf(HIGH_NUMBER);
		}
		
		return Integer.valueOf(hole.getScore());
	}
}
