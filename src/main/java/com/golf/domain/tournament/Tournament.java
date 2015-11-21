package com.golf.domain.tournament;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.golf.domain.day.Day;
import com.golf.domain.flight.Flight;
import com.golf.domain.scorecard.Scorecard;


@Entity
@Table(name="TOURNAMENT")
public class Tournament
{
	
	@Id
	@GeneratedValue
	@Column(name = "TOURNAMENT_ID", nullable = false)
	private long id;
	
	@Column(name = "TOURNAMENT_NAME", unique = true)
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name = "TOURNAMENT_ID", nullable = false, updatable = false)
	private List<Day> days;
	

	public long getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public List<Day> getDays()
	{
		if(days == null)
		{
			days = new ArrayList<Day>();
		}
		
		return days;
	}

	public void setDays(List<Day> days)
	{
		this.days = days;
	}
	
	public void addDay(Day day)
	{
		if(days == null)
		{
			days = new ArrayList<Day>();
		}
		
		days.add(day);
	}
	
	public Day getFirstDay()
	{
		Day day1 = null;
		
		if(days != null)
		{
			for (Iterator<Day> iterator = days.iterator(); iterator.hasNext();)
			{
				day1 = iterator.next();
				break;
			}
		}

		return day1;
	}
	
	public Day getSecondDay()
	{
		Day day2 = null;
		
		if(days != null)
		{
			for (Iterator<Day> iterator = days.iterator(); iterator.hasNext();)
			{
				day2 = (Day) iterator.next();
			}
		}
		
		return day2;
	}
	
	public List<TournamentPlayerScorecard> getTournamentPlayerScrorecards()
	{
		List<TournamentPlayerScorecard> list = new ArrayList<TournamentPlayerScorecard>();
		
		if(getFirstDay() != null && getFirstDay().getScorecards() != null)
		{
			for (Iterator<Scorecard> iterator = getFirstDay().getScorecards().iterator(); iterator.hasNext();)
			{
				Scorecard scorecard1 = (Scorecard) iterator.next();
				
				TournamentPlayerScorecard tournamentPlayerScorecard = new TournamentPlayerScorecard();
				tournamentPlayerScorecard.setPlayer(scorecard1.getPlayer());
				tournamentPlayerScorecard.setDayOneScorecard(scorecard1);
				tournamentPlayerScorecard.setDayTwoScorecard(getSecondDay().getPlayerScorecard(scorecard1.getPlayer()));
				
				list.add(tournamentPlayerScorecard);
			}
		}
		
		return list;
	}
	
	public List<TournamentScoreboard> getTournamentScoreboard()
	{
		Map<Flight, TournamentScoreboard> tournamentScorecards = new HashMap<Flight, TournamentScoreboard>();
		
		List<TournamentPlayerScorecard> tournamentPlayerScorecards = getTournamentPlayerScrorecards();
		
		for (Iterator<TournamentPlayerScorecard> iterator = tournamentPlayerScorecards.iterator(); iterator.hasNext();)
		{
			TournamentPlayerScorecard tournamentPlayerScorecard = iterator.next();
			
			Set<Flight> flights = tournamentPlayerScorecard.getDayOneScorecard().getFlights();
			
			for (Iterator<Flight> iterator2 = flights.iterator(); iterator2.hasNext();)
			{
				Flight flight = (Flight) iterator2.next();
				
				TournamentScoreboard scoreboard = (TournamentScoreboard)tournamentScorecards.get(flight);
				
				if(scoreboard == null)
				{
					scoreboard = new TournamentScoreboard();
					scoreboard.setFlight(flight);
				}
				
				scoreboard.addScorecard(tournamentPlayerScorecard);
				tournamentScorecards.put(flight, scoreboard);
			}
		}
		
		List<TournamentScoreboard> scoreboards = new ArrayList<TournamentScoreboard>();
		
		for (Iterator<Flight> iterator = tournamentScorecards.keySet().iterator(); iterator.hasNext();)
		{
			Flight flight = iterator.next();
			
			TournamentScoreboard scoreboard = tournamentScorecards.get(flight); 
			
			scoreboards.add(scoreboard);
		}
		
		return scoreboards;
	}
	
	public TournamentScoreboard getTournamentScoreboardByFlight(Flight flight)
	{
		List<TournamentPlayerScorecard> tournamentPlayerScorecards = getTournamentPlayerScrorecards();
		
		TournamentScoreboard scoreboard = new TournamentScoreboard();
		
		for (Iterator<TournamentPlayerScorecard> iterator = tournamentPlayerScorecards.iterator(); iterator.hasNext();)
		{
			TournamentPlayerScorecard tournamentPlayerScorecard = iterator.next();
			
			Set<Flight> flights = tournamentPlayerScorecard.getDayOneScorecard().getFlights();
			
			for (Iterator<Flight> iterator2 = flights.iterator(); iterator2.hasNext();)
			{
				Flight playerFlight = iterator2.next();

				if(playerFlight.getName().equals(flight.getName()))
				{
					scoreboard.setFlight(playerFlight);
					scoreboard.addScorecard(tournamentPlayerScorecard);
				}
			}
		}
		
		return scoreboard;
	}
	
	public int getTotalNumberOfPlayers()
	{
		return getTournamentPlayerScrorecards().size();
	}
	
//	public boolean isSeniorEligiblePlayer(Player player)
//	{
//		Date seniorEligible = DateUtil.add(DateConstants.YEAR, -60, getSecondDay().getDate());
//		
//		return player.getDateOfBirth().before(seniorEligible);	
//	}
	
	public boolean equals(Object obj)
	{
		Tournament tournament = (Tournament) obj;
		
		return this.getId() == tournament.getId() && this.name.equals(tournament.getName());
	}

	public String toString()
	{
		return this.getName();
	}
	
}
