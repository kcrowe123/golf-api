package com.golf.controller.tournament;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.golf.business.Accessor;
import com.golf.business.BaseFilter;
import com.golf.business.accessor.filter.PlayerFilter;
import com.golf.business.accessor.filter.TournamentFilter;
import com.golf.domain.player.Player1;

@RestController
public class PlayerController {
	
	@Inject
	private Accessor<Player1> playerAccessor;
	
    @RequestMapping("/player")
    public List<Player1> findTournament(@RequestParam(value="name", required=false) String name, @RequestParam(value=TournamentFilter.NAME, required=false) String sortBy, @RequestParam(value=BaseFilter.SORT_DESC, required=false) Boolean sortDescending, @RequestParam(value=BaseFilter.START_ITEM, required=false) Integer startItem, @RequestParam(value=BaseFilter.COUNT, required=false) Integer count) {
        return playerAccessor.find(new PlayerFilter(name, sortBy, sortDescending, startItem, count));
    }
}
