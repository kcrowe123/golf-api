package com.golf.domain.tournament;

import java.util.Iterator;

import com.golf.domain.flight.Flight;
import com.golf.domain.player.Player;
import com.golf.domain.scorecard.Scorecard;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentPlayerScorecard.
 */
public class TournamentPlayerScorecard
{
	
	/** The player. */
	private Player player;
	
	/** The day one scorecard. */
	private Scorecard dayOneScorecard;
	
	/** The day two scorecard. */
	private Scorecard dayTwoScorecard;
	
	/**
	 * Gets the handicap.
	 *
	 * @return the handicap
	 */
	public String getHandicap()
	{
		return dayOneScorecard.getHandicap() + "";
	}
	
	/**
	 * Gets the two day total.
	 *
	 * @return the two day total
	 */
	public String getTwoDayTotal()
	{
		if (Scorecard.DISQUALIFIED.equals(dayOneScorecard.getScore()) && Scorecard.DISQUALIFIED.equals(dayTwoScorecard.getScore()))
		{
			return Scorecard.DISQUALIFIED;
		}
		
		double day1 = 0;
		double day2 = 0;
		
		if (!Scorecard.DISQUALIFIED.equals(dayOneScorecard.getScore()))
		{
			day1 = Double.parseDouble(dayOneScorecard.getScore());
		}
		
		if (!Scorecard.DISQUALIFIED.equals(dayTwoScorecard.getScore()))
		{
			day2 = Double.parseDouble(dayTwoScorecard.getScore());
		}
		
		return (day1 + day2) + "";
	}
	
	/**
	 * Gets the two day handicap total.
	 *
	 * @return the two day handicap total
	 */
	public String getTwoDayHandicapTotal()
	{
		if (Scorecard.DISQUALIFIED.equals(dayOneScorecard.getHandicapScore()) && Scorecard.DISQUALIFIED.equals(dayTwoScorecard.getHandicapScore()))
		{
			return Scorecard.DISQUALIFIED;
		}
		
		double day1 = 0;
		double day2 = 0;
		
		if (!Scorecard.DISQUALIFIED.equals(dayOneScorecard.getHandicapScore()))
		{
			day1 = Double.parseDouble(dayOneScorecard.getHandicapScore());
		}
		
		if (!Scorecard.DISQUALIFIED.equals(dayTwoScorecard.getHandicapScore()))
		{
			day2 = Double.parseDouble(dayTwoScorecard.getHandicapScore());
		}
		
		return (day1 + day2) + "";
	}
	
	/**
	 * Gets the flight.
	 *
	 * @return the flight
	 */
	public String getFlight()
	{	
		String flights = "";
		
//		for (Iterator iterator = dayOneScorecard.getFlights().iterator(); iterator.hasNext();)
//		{
//			Flight flight = (Flight) iterator.next();
//			
//			flights = flights + (flight.getName() + ", ");
//		}
//		
//		if(flights != null && flights.length() > 0)
//		{
//			flights = flights.substring(0, flights.length() - 2);
//		}
		
		return flights;
	}
	
	/**
	 * Gets the tournament score.
	 *
	 * @return the tournament score
	 */
	public String getTournamentScore()
	{
		return dayOneScorecard.getHandicapScore() + dayTwoScorecard.getHandicapScore() + "";
	}

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public Player getPlayer()
	{
		return player;
	}

	/**
	 * Sets the player.
	 *
	 * @param player the new player
	 */
	public void setPlayer(Player player)
	{
		this.player = player;
	}

	/**
	 * Gets the day one scorecard.
	 *
	 * @return the day one scorecard
	 */
	public Scorecard getDayOneScorecard()
	{
		return dayOneScorecard;
	}

	/**
	 * Sets the day one scorecard.
	 *
	 * @param dayOneScorecard the new day one scorecard
	 */
	public void setDayOneScorecard(Scorecard dayOneScorecard)
	{
		this.dayOneScorecard = dayOneScorecard;
	}

	/**
	 * Gets the day two scorecard.
	 *
	 * @return the day two scorecard
	 */
	public Scorecard getDayTwoScorecard()
	{
		return dayTwoScorecard;
	}

	/**
	 * Sets the day two scorecard.
	 *
	 * @param dayTwoScorecard the new day two scorecard
	 */
	public void setDayTwoScorecard(Scorecard dayTwoScorecard)
	{
		this.dayTwoScorecard = dayTwoScorecard;
	}
}
