package com.golf.domain.tournament;

import java.io.Serializable;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import com.golf.domain.day.Day;
import com.golf.domain.flight.Flight;
import com.golf.domain.scorecard.Scorecard;


// TODO: Auto-generated Javadoc
/**
 * The Class Tournament.
 */
@Entity
@Table(name = "TOURNAMENT")
public class Tournament extends com.golf.domain.Entity implements Serializable 
{
    
    /** The Constant HASH_CODE_MULTIPLIER. */
    private static final int HASH_CODE_MULTIPLIER = 7;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @GeneratedValue
    @Column(name = "TOURNAMENT_ID", nullable = false)
    private Long id;
    
    /** The name. */
    @Column(name = "TOURNAMENT_NAME", unique = true)
    private String name;
    
    /** The days. */
    //@JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "TOURNAMENT_ID", nullable = false, updatable = false)
    private List<Day> days;
    

    /**
     * Gets the id.
     *
     * @return  <code>Long</code>
     */
    public Long getId()
    {
        return id;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Gets the days.
     *
     * @return the days
     */
    public List<Day> getDays()
    {
        if (days == null)
        {
            days = new ArrayList<Day>();
        }
        
        return days;
    }

    /**
     * Sets the days.
     *
     * @param days the new days
     */
    public void setDays(List<Day> days)
    {
        this.days = days;
    }
    
    /**
     * Adds the day.
     *
     * @param day the day
     */
    public void addDay(Day day)
    {
        if (days == null)
        {
            days = new ArrayList<Day>();
        }
        
        days.add(day);
    }
    
    /**
     * Gets the first day.
     *
     * @return the first day
     */
    public Day getFirstDay()
    {
        Day day1 = null;
        
        if (days != null)
        {
            for (Iterator<Day> iterator = days.iterator(); iterator.hasNext();)
            {
                day1 = iterator.next();
                break;
            }
        }

        return day1;
    }
    
    /**
     * Gets the second day.
     *
     * @return the second day
     */
    public Day getSecondDay()
    {
        Day day2 = null;
        
        if (days != null)
        {
            for (Iterator<Day> iterator = days.iterator(); iterator.hasNext();)
            {
                day2 = (Day) iterator.next();
            }
        }
        
        return day2;
    }
    
    /**
     * Gets the tournament player scrorecards.
     *
     * @return the tournament player scrorecards
     */
    public List<TournamentPlayerScorecard> getTournamentPlayerScrorecards()
    {
        List<TournamentPlayerScorecard> list = new ArrayList<TournamentPlayerScorecard>();
        
        if (getFirstDay() != null && getFirstDay().getScorecards() != null)
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
    
    /**
     * Gets the tournament scoreboard.
     *
     * @return the tournament scoreboard
     */
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
                
                TournamentScoreboard scoreboard = (TournamentScoreboard) tournamentScorecards.get(flight);
                
                if (scoreboard == null)
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
    
    /**
     * Gets the tournament scoreboard by flight.
     *
     * @param flight the flight
     * @return the tournament scoreboard by flight
     */
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

                if (playerFlight.getName().equals(flight.getName()))
                {
                    scoreboard.setFlight(playerFlight);
                    scoreboard.addScorecard(tournamentPlayerScorecard);
                }
            }
        }
        
        return scoreboard;
    }
    
    /**
     * Gets the total number of players.
     *
     * @return the total number of players
     */
    public int getTotalNumberOfPlayers()
    {
        return getTournamentPlayerScrorecards().size();
    }
    
//    public boolean isSeniorEligiblePlayer(Player player)
//    {
//        Date seniorEligible = DateUtil.add(DateConstants.YEAR, -60, getSecondDay().getDate());
//        
//        return player.getDateOfBirth().before(seniorEligible);    
//    }
    

    /* (non-Javadoc)
 * @see com.golf.domain.Entity#addEntityFieldsToEqualsBuilder(org.apache.commons.lang3.builder.EqualsBuilder, java.lang.Object)
 */
@Override
    protected void addEntityFieldsToEqualsBuilder(EqualsBuilder builder, Object obj) {
        Tournament rhs = (Tournament) obj;
        builder.append(name, rhs.name);
    }

    /* (non-Javadoc)
     * @see com.golf.domain.ValueObject#hashCodeMultiplier()
     */
    @Override
    protected int hashCodeMultiplier() {
        return HASH_CODE_MULTIPLIER;
    }

    /* (non-Javadoc)
     * @see com.golf.domain.Entity#addEntityFieldsToHashCodeBuilder(org.apache.commons.lang3.builder.HashCodeBuilder)
     */
    @Override
    protected void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder) {
        builder.append(name);
    }

    /* (non-Javadoc)
     * @see com.golf.domain.Entity#addEntityFieldsToToStringBuilder(org.apache.commons.lang3.builder.ToStringBuilder)
     */
    @Override
    protected void addEntityFieldsToToStringBuilder(ToStringBuilder builder) {
        builder.append("name", name);
    }
    
}
