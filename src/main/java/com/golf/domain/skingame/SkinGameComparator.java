package com.golf.domain.skingame;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinGameComparator.
 */
public class SkinGameComparator implements Comparator<SkinGame>
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(SkinGame o1, SkinGame o2)
	{
		return o1.getSkin().getName().compareTo(o2.getSkin().getName());
	}

}
