package com.golf.business.accessor.filter.tournament;

import com.golf.business.BaseFilter;
import com.golf.domain.tournament.Tournament;

/**
 * @author Keith TournamentFilter extends BaseFilter<Tournament>.
 */
public class TournamentFilter extends BaseFilter<Tournament> {
    
    /** Static constant for NAME. */
    public static final String NAME = "name";
    
    /**
     * @param name            <code>String</code>
     * @param sortBy          <code>String</code>
     * @param sortDescending  <code>Boolean</code>
     * @param startItem       <code>Integer</code>
     * @param count           <code>Integer</code>
     */
    public TournamentFilter(String name, String sortBy, Boolean sortDescending, Integer startItem, Integer count) {
        super(sortBy, sortDescending, startItem, count);
        addStringCriterion(NAME, name);
    }

}
