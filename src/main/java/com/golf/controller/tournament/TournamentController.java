package com.golf.controller.tournament;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.golf.business.Accessor;
import com.golf.business.BaseFilter;
import com.golf.business.accessor.filter.tournament.TournamentFilter;
import com.golf.domain.tournament.Tournament;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentController.
 */
@RestController
public class TournamentController {

    /** The tournament accessor. */
    @Inject
    private Accessor<Tournament> tournamentAccessor;
    
    /**
     * Find tournament.
     *
     * @param name the name
     * @param sortBy the sort by
     * @param sortDescending the sort descending
     * @param startItem the start item
     * @param count the count
     * @return the list
     */
    @RequestMapping("/tournament")
    public List<Tournament> findTournament(@RequestParam(value = "name", required = false) String name, @RequestParam(value = TournamentFilter.NAME, required = false) String sortBy, @RequestParam(value = BaseFilter.SORT_DESC, required = false) Boolean sortDescending, @RequestParam(value = BaseFilter.START_ITEM, required = false) Integer startItem, @RequestParam(value = BaseFilter.COUNT, required = false) Integer count) {
    	System.out.println(name);
        return tournamentAccessor.find(new TournamentFilter(name, sortBy, sortDescending, startItem, count));
    }
}
