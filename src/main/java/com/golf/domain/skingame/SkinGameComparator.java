package com.golf.domain.skingame;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinGameComparator.
 */
public class SkinGameComparator implements Comparator<SkinGame>
{

    /**
     *  @param  o1  <code>SkinGame</code>
     *  @param  o2  <code>SkinGame</code>
     *  @return     <code>int</code> 
     */
	public int compare(SkinGame o1, SkinGame o2)
	{
		return o1.getSkin().getName().compareTo(o2.getSkin().getName());
	}

}
