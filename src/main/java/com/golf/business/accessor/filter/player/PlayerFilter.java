package com.golf.business.accessor.filter.player;

import com.golf.business.BaseFilter;
import com.golf.domain.player.Player;

/**
 * @author Keith PlayerFilter extends BaseFilter<Tournament>.
 */
public class PlayerFilter extends BaseFilter<Player> {
    
    /** Static constant for NAME. */
    public static final String NAME = "name";
    
    /**
     * @param name            <code>String</code>
     * @param sortBy          <code>String</code>
     * @param sortDescending  <code>Boolean</code>
     * @param startItem       <code>Integer</code>
     * @param count           <code>Integer</code>
     */
    public PlayerFilter(String name, String sortBy, Boolean sortDescending, Integer startItem, Integer count) {
        super(sortBy, sortDescending, startItem, count);
        addStringCriterion(NAME, name);
    }

}
