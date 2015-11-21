//package com.golf.controller.tournament;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.golf.business.Accessor;
//import com.golf.business.BaseFilter;
//import com.golf.business.accessor.filter.TournamentFilter;
//import com.golf.domain.tournament.Tournament;
//
//@RestController
//public class TournamentController {
//	
//	@Inject
//	private Accessor<Tournament> tournamentAccessor;
//	
//    @RequestMapping("/tournament")
//    public List<Tournament> findTournament(@RequestParam(value="name", required=false) String name, @RequestParam(value=TournamentFilter.NAME, required=false) String sortBy, @RequestParam(value=BaseFilter.SORT_DESC, required=false) Boolean sortDescending, @RequestParam(value=BaseFilter.START_ITEM, required=false) Integer startItem, @RequestParam(value=BaseFilter.COUNT, required=false) Integer count) {
//        return tournamentAccessor.find(new TournamentFilter(name, sortBy, sortDescending, startItem, count));
//    }
//}
