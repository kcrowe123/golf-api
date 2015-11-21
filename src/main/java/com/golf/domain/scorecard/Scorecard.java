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

@Entity
@Table(name="SCORECARD")
public class Scorecard
{
	public static final String DISQUALIFIED = "DQ";
	
	@Id
	@GeneratedValue
	@Column(name = "SCORECARD_ID", nullable = false)
	private long id;
	
	@Column(name="HANDICAP")
	private int handicap;
	
	@Column(name="FIRST_HOLE")
	private int firstHole;
	
	@Column(name="SECOND_HOLE")
	private int secondHole;
	
	@Column(name="THIRD_HOLE")
	private int thirdHole;
	
	@Column(name="FOURTH_HOLE")
	private int fourthHole;
	
	@Column(name="FIFTH_HOLE")
	private int fifthHole;
	
	@Column(name="SIXTH_HOLE")
	private int sixthHole;
	
	@Column(name="SEVENTH_HOLE")
	private int seventhHole;
	
	@Column(name="EIGHTH_HOLE")
	private int eigthHole;
	
	@Column(name="NINTH_HOLE")
	private int ninthHole;
	
	@Column(name="TENTH_HOLE")
	private int tenthHole;
	
	@Column(name="ELEVENTH_HOLE")
	private int eleventhHole;
	
	@Column(name="TWELTH_HOLE")
	private int twelthHole;
	
	@Column(name="THIRTEENTH_HOLE")
	private int thirteenthHole;
	
	@Column(name="FOURTEENTH_HOLE")
	private int fourteenthHole;
	
	@Column(name="FIFTEENTH_HOLE")
	private int fifteenthHole;
	
	@Column(name="SIXTEENTH_HOLE")
	private int sixteenthHole;
	
	@Column(name="SEVENTEENTH_HOLE")
	private int seventeenthHole;
	
	@Column(name="EIGHTEENTH_HOLE")
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

	
	
	public Scorecard()
	{
		
	}
	
	public Scorecard(int handicap)
	{
		this.handicap = handicap;
	}
	

	public Long getId()
	{
		return id;
	}

	public int getHandicap()
	{
		return handicap;
	}

	public void setHandicap(int handicap)
	{
		this.handicap = handicap;
	}
	

	public int getFirstHole()
	{
		return firstHole;
	}

	public void setFirstHole(int firstHole)
	{
		this.firstHole = firstHole;
	}
	

	public int getSecondHole()
	{
		return secondHole;
	}
	
	public void setSecondHole(int secondHole)
	{
		this.secondHole = secondHole;
	}
	
	public int getThirdHole()
	{
		return thirdHole;
	}
	
	public void setThirdHole(int thirdHole)
	{
		this.thirdHole = thirdHole;
	}
	
	public int getFourthHole()
	{
		return fourthHole;
	}

	public void setFourthHole(int fourthHole)
	{
		this.fourthHole = fourthHole;
	}
	

	public int getFifthHole()
	{
		return fifthHole;
	}

	public void setFifthHole(int fifthHole)
	{
		this.fifthHole = fifthHole;
	}
	
	public int getSixthHole()
	{
		return sixthHole;
	}

	public void setSixthHole(int sixthHole)
	{
		this.sixthHole = sixthHole;
	}
	

	public int getSeventhHole()
	{
		return seventhHole;
	}

	public void setSeventhHole(int seventhHole)
	{
		this.seventhHole = seventhHole;
	}
	

	public int getEigthHole()
	{
		return eigthHole;
	}

	public void setEigthHole(int eigthHole)
	{
		this.eigthHole = eigthHole;
	}
	

	public int getNinthHole()
	{
		return ninthHole;
	}

	public void setNinthHole(int ninthHole)
	{
		this.ninthHole = ninthHole;
	}
	

	public int getTenthHole()
	{
		return tenthHole;
	}

	public void setTenthHole(int tenthHole)
	{
		this.tenthHole = tenthHole;
	}
	

	public int getEleventhHole()
	{
		return eleventhHole;
	}

	public void setEleventhHole(int eleventhHole)
	{
		this.eleventhHole = eleventhHole;
	}
	

	public int getTwelthHole()
	{
		return twelthHole;
	}

	public void setTwelthHole(int twelthHole)
	{
		this.twelthHole = twelthHole;
	}
	

	public int getThirteenthHole()
	{
		return thirteenthHole;
	}

	public void setThirteenthHole(int thirteenthHole)
	{
		this.thirteenthHole = thirteenthHole;
	}
	

	public int getFourteenthHole()
	{
		return fourteenthHole;
	}

	public void setFourteenthHole(int fourteenthHole)
	{
		this.fourteenthHole = fourteenthHole;
	}
	

	public int getFifteenthHole()
	{
		return fifteenthHole;
	}

	public void setFifteenthHole(int fifteenthHole)
	{
		this.fifteenthHole = fifteenthHole;
	}
	

	public int getSixteenthHole()
	{
		return sixteenthHole;
	}

	public void setSixteenthHole(int sixteenthHole)
	{
		this.sixteenthHole = sixteenthHole;
	}
	

	public int getSeventeenthHole()
	{
		return seventeenthHole;
	}

	public void setSeventeenthHole(int seventeenthHole)
	{
		this.seventeenthHole = seventeenthHole;
	}
	

	public int getEighteenthHole()
	{
		return eighteenthHole;
	}

	public void setEighteenthHole(int eighteenthHole)
	{
		this.eighteenthHole = eighteenthHole;
	}
	
	public Day getDay()
	{
		return day;
	}

	public void setDay(Day day)
	{
		this.day = day;
	}


	public Player getPlayer()
	{
		return player;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}

	public Set<Flight> getFlights()
	{
		if(flights == null)
		{
			flights = new HashSet<Flight>();
		}
		
		return flights;
	}

	public void setFlights(Set<Flight> flights)
	{
		this.flights = flights;
	}
	
	public Set<Skins> getSkins()
	{
		if(skins == null)
		{
			skins = new HashSet<Skins>();
		}
		
		return skins;
	}

	public void setSkins(Set<Skins> skins)
	{
		this.skins = skins;
	}
	
	public void addSkin(Skins skin)
	{
		getSkins().add(skin);
	}
	
	public String getScorecardSkinsGames()
	{	
		String skinGames = "";
		
		for (Iterator<Skins> iterator = getSkins().iterator(); iterator.hasNext();)
		{
			Skins skin = iterator.next();
			
			skinGames = skinGames + (skin.getName() + ", ");
		}
		
		if(skinGames != null && skinGames.length() > 0)
		{
			skinGames = skinGames.substring(0, skinGames.length() - 2);
		}
		System.out.println("******************** getScorecardSkinsGames() "+System.getProperty("java.version"));
		return skinGames;
	}
	
	public String getScorecardFlights()
	{	
		String flights = "";
		
		for (Iterator<Flight> iterator = getFlights().iterator(); iterator.hasNext();)
		{
			Flight flight = iterator.next();
			
			flights = flights + (flight.getName() + ", ");
		}
		
		if(flights != null && flights.length() > 0)
		{
			flights = flights.substring(0, flights.length() - 2);
		}
		
		System.out.println("******************** getScorecardFlights() "+System.getProperty("java.version"));
		
		return flights;
	}
	
	public String getScore()
	{
				
		if(isDisqualified())
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
			+"";
	}
	
	private boolean isDisqualified()
	{
		if(firstHole < 1)
		{
			return true;
		}
		else if(secondHole < 1)
		{
			return true;
		}
		else if(thirdHole < 1)
		{
			return true;
		}
		else if(fourthHole < 1)
		{
			return true;
		}
		else if(fifthHole < 1)
		{
			return true;
		}
		else if(sixthHole < 1)
		{
			return true;
		}
		else if(seventhHole < 1)
		{
			return true;
		}
		else if(eigthHole < 1)
		{
			return true;
		}
		else if(ninthHole < 1)
		{
			return true;
		}
		else if(tenthHole < 1)
		{
			return true;
		}
		else if(eleventhHole < 1)
		{
			return true;
		}
		else if(twelthHole < 1)
		{
			return true;
		}
		else if(thirteenthHole < 1)
		{
			return true;
		}
		else if(fourteenthHole < 1)
		{
			return true;
		}
		else if(fifteenthHole < 1)
		{
			return true;
		}
		else if(sixteenthHole < 1)
		{
			return true;
		}
		else if(seventeenthHole < 1)
		{
			return true;
		}
		else if(eighteenthHole < 1)
		{
			return true;
		}
		
		return false;
	}
	

	public String getHandicapScore()
	{
		if(DISQUALIFIED.equals(getScore()))
		{
			return DISQUALIFIED;
		}
		
		double total = Double.parseDouble(getScore());
		
		double handicap = this.handicap;
		
		Double handicapScore = new Double(total - (handicap / 2));
		
		return handicapScore.toString();
	}


}
