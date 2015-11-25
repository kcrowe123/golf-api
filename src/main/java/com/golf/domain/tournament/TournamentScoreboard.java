package com.golf.domain.tournament;

import java.util.ArrayList;
import java.util.List;

import com.golf.domain.flight.Flight;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentScoreboard.
 */
public class TournamentScoreboard
{
	
	/** The flight. */
	private Flight flight;
	
	/** The scorecards. */
	private List scorecards;
	
	/**
	 * Gets the total players.
	 *
	 * @return the total players
	 */
	public String getTotalPlayers()
	{
		if (scorecards != null)
		{
			return scorecards.size() + "";
		}
		
		return "0";
	}

	/**
	 * Gets the flight.
	 *
	 * @return the flight
	 */
	public Flight getFlight()
	{
		return flight;
	}

	/**
	 * Sets the flight.
	 *
	 * @param flight the new flight
	 */
	public void setFlight(Flight flight)
	{
		this.flight = flight;
	}

	/**
	 * Gets the scorecards.
	 *
	 * @return the scorecards
	 */
	public List getScorecards()
	{
		return scorecards;
	}

	/**
	 * Sets the scorecards.
	 *
	 * @param scorecards the new scorecards
	 */
	public void setScorecards(List scorecards)
	{
		this.scorecards = scorecards;
	}
	
	/**
	 * Adds the scorecard.
	 *
	 * @param scorecard the scorecard
	 */
	public void addScorecard(TournamentPlayerScorecard scorecard)
	{
		if (scorecards == null)
		{
			scorecards = new ArrayList();
		}
		
		scorecards.add(scorecard);
		
	}
	
	
}
