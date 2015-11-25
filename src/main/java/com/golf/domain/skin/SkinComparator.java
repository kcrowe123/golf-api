package com.golf.domain.skin;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinComparator.
 */
public class SkinComparator implements Comparator<Skins>
{
    
    /**
     * Compare.
     *
     * @param o1 the o1
     * @param o2 the o2
     * @return     <code>int</code>
     */
	public int compare(Skins o1, Skins o2)
	{	
		return o1.getName().compareTo(o2.getName());
	}

}
