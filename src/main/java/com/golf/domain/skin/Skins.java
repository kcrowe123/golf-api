package com.golf.domain.skin;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.day.Day;
import com.golf.domain.scorecard.Scorecard;

@Entity
@Table(name="SKIN")
public class Skins
{
	
	@Id
	@GeneratedValue
	@Column(name = "SKIN_ID", nullable = false)
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DAY_ID", nullable = false)
	private Day day;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SKIN_SCORECARD", joinColumns = { @JoinColumn(name = "SKIN_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) })
	private Set<Scorecard> scorecards;
	
	public Skins()
	{
		
	}
	
	public Skins(String name, Day day)
	{
		this.name = name;
		this.day = day;
	}
	
	public Long getId()
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

	public Day getDay()
	{
		return day;
	}

	public void setDay(Day day)
	{
		this.day = day;
	}
	
	public Set<Scorecard> getScorecards()
	{
		if (scorecards == null)
		{
			scorecards = new HashSet<Scorecard>();
		}
		
		return scorecards;
	}

	public void setScorecards(Set<Scorecard> scorecards)
	{
		this.scorecards = scorecards;
	}

	public void addScorecard(Scorecard scorecard)
	{
		getScorecards().add(scorecard);
	}


}
