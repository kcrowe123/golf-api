package com.golf.domain.scorecard;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.golf.domain.day.Day;
import com.golf.domain.flight.Flight;
import com.golf.domain.player.Player;
import com.golf.domain.skin.Skins;

/**
 * 
 * @author Keith This is domain object for Scorecard.
 *
 */
@Entity
@Table(name = "SCORECARD")
public class Scorecard
{
    /** static constant for DISQUALIFIED. */
    public static final String DISQUALIFIED = "DQ";
    
    @Id
    @GeneratedValue
    @Column(name = "SCORECARD_ID", nullable = false)
    private long id;
    
    @Column(name = "HANDICAP")
    private int handicap;
    
    @Column(name = "FIRST_HOLE")
    private int firstHole;
    
    @Column(name = "SECOND_HOLE")
    private int secondHole;
    
    @Column(name = "THIRD_HOLE")
    private int thirdHole;
    
    @Column(name = "FOURTH_HOLE")
    private int fourthHole;
    
    @Column(name = "FIFTH_HOLE")
    private int fifthHole;
    
    @Column(name = "SIXTH_HOLE")
    private int sixthHole;
    
    @Column(name = "SEVENTH_HOLE")
    private int seventhHole;
    
    @Column(name = "EIGHTH_HOLE")
    private int eigthHole;
    
    @Column(name = "NINTH_HOLE")
    private int ninthHole;
    
    @Column(name = "TENTH_HOLE")
    private int tenthHole;
    
    @Column(name = "ELEVENTH_HOLE")
    private int eleventhHole;
    
    @Column(name = "TWELTH_HOLE")
    private int twelthHole;
    
    @Column(name = "THIRTEENTH_HOLE")
    private int thirteenthHole;
    
    @Column(name = "FOURTEENTH_HOLE")
    private int fourteenthHole;
    
    @Column(name = "FIFTEENTH_HOLE")
    private int fifteenthHole;
    
    @Column(name = "SIXTEENTH_HOLE")
    private int sixteenthHole;
    
    @Column(name = "SEVENTEENTH_HOLE")
    private int seventeenthHole;
    
    @Column(name = "EIGHTEENTH_HOLE")
    private int eighteenthHole;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAY_ID", nullable = false)
    private Day day;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID", nullable = false)
    private Player player;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "FLIGHT_SCORECARD", joinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "FLIGHT_ID", nullable = false, updatable = false) })
    private Set<Flight> flights;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SKIN_SCORECARD", joinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SKIN_ID", nullable = false, updatable = false) })
    private Set<Skins> skins;

    
    /** No arg Constructor. */
    public Scorecard()
    {
        
    }
    
    /**
     * @param handicap  <code>int</code> 
     */
    public Scorecard(int handicap)
    {
        this.handicap = handicap;
    }
    
    /**
     * @return  <code>Long</code>
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @return  <code>int</code>
     */
    public int getHandicap()
    {
        return handicap;
    }
    
    /**
     * @param handicap   <code>int</code>
     */
    public void setHandicap(int handicap)
    {
        this.handicap = handicap;
    }
    
    
    /**
     * @return  <code>int</code>
     */
    public int getFirstHole()
    {
        return firstHole;
    }
    
    /**
     * @param firstHole   <code>int</code>
     */
    public void setFirstHole(int firstHole)
    {
        this.firstHole = firstHole;
    }
    
    
    /**
     * @return  <code>int</code>
     */
    public int getSecondHole()
    {
        return secondHole;
    }
    
    /**
     * @param secondHole   <code>int</code>
     */
    public void setSecondHole(int secondHole)
    {
        this.secondHole = secondHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getThirdHole()
    {
        return thirdHole;
    }
    
    /**
     * @param thirdHole   <code>int</code>
     */
    public void setThirdHole(int thirdHole)
    {
        this.thirdHole = thirdHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getFourthHole()
    {
        return fourthHole;
    }
    
    /**
     * @param fourthHole  <code>int</code>
     */
    public void setFourthHole(int fourthHole)
    {
        this.fourthHole = fourthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getFifthHole()
    {
        return fifthHole;
    }
    
    /**
     * @param fifthHole  <code>int</code>
     */
    public void setFifthHole(int fifthHole)
    {
        this.fifthHole = fifthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getSixthHole()
    {
        return sixthHole;
    }
    
    /**
     * @param sixthHole  <code>int</code>
     */
    public void setSixthHole(int sixthHole)
    {
        this.sixthHole = sixthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getSeventhHole()
    {
        return seventhHole;
    }

    /**
     * @param seventhHole  <code>int</code>
     */
    public void setSeventhHole(int seventhHole)
    {
        this.seventhHole = seventhHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getEigthHole()
    {
        return eigthHole;
    }

    /**
     * @param eigthHole  <code>int</code>
     */
    public void setEigthHole(int eigthHole)
    {
        this.eigthHole = eigthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getNinthHole()
    {
        return ninthHole;
    }
    
    /**
     * @param ninthHole  <code>int</code>
     */
    public void setNinthHole(int ninthHole)
    {
        this.ninthHole = ninthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getTenthHole()
    {
        return tenthHole;
    }

    /**
     * @param tenthHole  <code>int</code>
     */
    public void setTenthHole(int tenthHole)
    {
        this.tenthHole = tenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getEleventhHole()
    {
        return eleventhHole;
    }

    /**
     * @param eleventhHole  <code>int</code>
     */
    public void setEleventhHole(int eleventhHole)
    {
        this.eleventhHole = eleventhHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getTwelthHole()
    {
        return twelthHole;
    }

    /**
     * @param twelthHole  <code>int</code>
     */
    public void setTwelthHole(int twelthHole)
    {
        this.twelthHole = twelthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getThirteenthHole()
    {
        return thirteenthHole;
    }

    /**
     * @param thirteenthHole  <code>int</code>
     */
    public void setThirteenthHole(int thirteenthHole)
    {
        this.thirteenthHole = thirteenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getFourteenthHole()
    {
        return fourteenthHole;
    }

    /**
     * @param fourteenthHole  <code>int</code>
     */
    public void setFourteenthHole(int fourteenthHole)
    {
        this.fourteenthHole = fourteenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getFifteenthHole()
    {
        return fifteenthHole;
    }

    /**
     * @param fifteenthHole  <code>int</code>
     */
    public void setFifteenthHole(int fifteenthHole)
    {
        this.fifteenthHole = fifteenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getSixteenthHole()
    {
        return sixteenthHole;
    }

    /**
     * @param sixteenthHole  <code>int</code>
     */
    public void setSixteenthHole(int sixteenthHole)
    {
        this.sixteenthHole = sixteenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getSeventeenthHole()
    {
        return seventeenthHole;
    }

    /**
     * @param seventeenthHole  <code>int</code>
     */
    public void setSeventeenthHole(int seventeenthHole)
    {
        this.seventeenthHole = seventeenthHole;
    }
    
    /**
     * @return  <code>int</code>
     */
    public int getEighteenthHole()
    {
        return eighteenthHole;
    }

    /**
     * @param eighteenthHole  <code>int</code>
     */
    public void setEighteenthHole(int eighteenthHole)
    {
        this.eighteenthHole = eighteenthHole;
    }

    /**
     * @return  <code>Day</code>
     */
    public Day getDay()
    {
        return day;
    }

    /**
     * @param day  <code>Day</code>
     */
    public void setDay(Day day)
    {
        this.day = day;
    }

    /**
     * @return  <code>Player</code>
     */
    public Player getPlayer()
    {
        return player;
    }
    
    /**
     * @param player   <code>Player</code>
     */
    public void setPlayer(Player player)
    {
        this.player = player;
    }

    /**
     * @return  <code>Set<Flights></code>
     */
    public Set<Flight> getFlights()
    {
        if(flights == null)
        {
            flights = new HashSet<Flight>();
        }
        
        return flights;
    }

    /**
     * @param flights   <code>Set<Flight></code>
     */
    public void setFlights(Set<Flight> flights)
    {
        this.flights = flights;
    }
    
    /**
     * @return  <code>Set<Skins></code>
     */
    public Set<Skins> getSkins()
    {
        if (skins == null)
        {
            skins = new HashSet<Skins>();
        }
        
        return skins;
    }
    
    /**
     * @param skins    <code>Set<Skins></code>
     */
    public void setSkins(Set<Skins> skins)
    {
        this.skins = skins;
    }
    
    /**
     * @param skin   <code>Skins</code>
     */
    public void addSkin(Skins skin)
    {
        getSkins().add(skin);
    }
    
    /**
     * @return  <code>String</code>
     */
    public String getScorecardSkinsGames()
    {    
        String skinGames = "";
        
        for (Iterator<Skins> iterator = getSkins().iterator(); iterator.hasNext();) {
            Skins skin = iterator.next();
            
            skinGames = skinGames + (skin.getName() + ", ");
        }
        
        if (skinGames != null && skinGames.length() > 0) {
            skinGames = skinGames.substring(0, skinGames.length() - 2);
        }
        
        return skinGames;
    }
    
    /**
     * @return  <code>String</code>
     */
    public String getScorecardFlights()
    {    
        String flights = "";
        
        for (Iterator<Flight> iterator = getFlights().iterator(); iterator.hasNext();) {
            Flight flight = iterator.next();
            
            flights = flights + (flight.getName() + ", ");
        }
        
        if (flights != null && flights.length() > 0) {
            flights = flights.substring(0, flights.length() - 2);
        }
        
        return flights;
    }
    
    /**
     * @return  <code>String</code>
     */
    public String getScore()
    {
                
        if (isDisqualified())
        {
            return DISQUALIFIED;
        }
        
        return firstHole
            + secondHole
            + thirdHole 
            + fourthHole
            + fifthHole
            + sixthHole
            + seventhHole
            + eigthHole
            + ninthHole
            + tenthHole
            + eleventhHole
            + twelthHole
            + thirteenthHole
            + fourteenthHole
            + fifteenthHole
            + sixteenthHole
            + seventeenthHole
            + eighteenthHole
            + "";
    }
    
    /**
     * @return  <code>boolean</code>
     */
    private boolean isDisqualified()
    {
        if (firstHole < 1)
        {
            return true;
        }
        else if (secondHole < 1)
        {
            return true;
        }
        else if (thirdHole < 1)
        {
            return true;
        }
        else if (fourthHole < 1)
        {
            return true;
        }
        else if (fifthHole < 1)
        {
            return true;
        }
        else if (sixthHole < 1)
        {
            return true;
        }
        else if (seventhHole < 1)
        {
            return true;
        }
        else if (eigthHole < 1)
        {
            return true;
        }
        else if (ninthHole < 1)
        {
            return true;
        }
        else if (tenthHole < 1)
        {
            return true;
        }
        else if (eleventhHole < 1)
        {
            return true;
        }
        else if (twelthHole < 1)
        {
            return true;
        }
        else if (thirteenthHole < 1)
        {
            return true;
        }
        else if (fourteenthHole < 1)
        {
            return true;
        }
        else if (fifteenthHole < 1)
        {
            return true;
        }
        else if (sixteenthHole < 1)
        {
            return true;
        }
        else if (seventeenthHole < 1)
        {
            return true;
        }
        else if (eighteenthHole < 1)
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * @return  <code>String</code>
     */
    public String getHandicapScore()
    {
        if (DISQUALIFIED.equals(getScore()))
        {
            return DISQUALIFIED;
        }
        
        double total = Double.parseDouble(getScore());
        
        double handicap = this.handicap;
        
        Double handicapScore = Double.valueOf(total - (handicap / 2));
        
        return handicapScore.toString();
    }


}
