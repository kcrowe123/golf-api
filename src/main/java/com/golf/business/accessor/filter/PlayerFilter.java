package com.golf.business.accessor.filter;

import com.golf.business.BaseFilter;
import com.golf.domain.tournament.Player;


public class PlayerFilter extends BaseFilter<Player> {
	
	public static final String NAME = "name";
	
	public PlayerFilter(String name, String sortBy, Boolean sortDescending, Integer startItem, Integer count) {
		super(sortBy, sortDescending, startItem, count);
		addStringCriterion(NAME, name);
	}

}
