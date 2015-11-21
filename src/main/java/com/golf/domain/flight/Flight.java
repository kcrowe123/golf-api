package com.golf.domain.flight;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.golf.domain.scorecard.Scorecard;


@Entity
@Table(name="FLIGHT")
public class Flight
{
	@Id
	@GeneratedValue
	@Column(name = "FLIGHT_ID", nullable = false)
	private long id;
	
	@Column(name="FLIGHT_NM", nullable = false)
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "FLIGHT_SCORECARD", joinColumns = { @JoinColumn(name = "FLIGHT_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) })
	private Set<Scorecard> scorecards;
	
	public Flight()
	{
		
	}
	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<Scorecard> getScorecards()
	{
		return scorecards;
	}

	public void setScorecards(Set<Scorecard> scorecards)
	{
		this.scorecards = scorecards;
	}

	
}
