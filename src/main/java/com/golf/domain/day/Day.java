package com.golf.domain.day;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.golf.domain.player.Player;
import com.golf.domain.scorecard.Scorecard;
import com.golf.domain.skin.Skins;
import com.golf.domain.tournament.Tournament;
//import com.golf.framework.date.DateUtil;


@Entity
@Table(name="DAY")
public class Day
{
	
	@Id
	@GeneratedValue
	@Column(name = "DAY_ID", nullable = false)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOURNAMENT_ID", nullable = false, insertable = false, updatable = false)
	private Tournament tournament;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "COURSE_NAME")
	private String course;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="day", orphanRemoval=true)
	private Set<Scorecard> scorecards;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="day", orphanRemoval=true)
	private Set<Skins> skins;
	
	public Day()
	{
		
	}
	
	public Long getId()
	{
		return id;
	}
	
	public Tournament getTournament()
	{
		return tournament;
	}

	public void setTournament(Tournament tournament)
	{
		this.tournament = tournament;
	}
	
	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public String getCourse()
	{
		return course;
	}

	public void setCourse(String course)
	{
		this.course = course;
	}
		
	public Set<Scorecard> getScorecards()
	{
		return scorecards;
	}

	public void setScorecards(Set<Scorecard> scorecards)
	{
		this.scorecards = scorecards;
	}
	
	public void addScorecard(Scorecard scorecard)
	{		
		//scorecard.setDay(this);
		scorecards.add(scorecard);
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

	public Scorecard getPlayerScorecard(Player player)
	{
		if(scorecards != null && !scorecards.isEmpty())
		{
			for (Iterator<Scorecard> iterator = scorecards.iterator(); iterator.hasNext();)
			{
				Scorecard scorecard = (Scorecard) iterator.next();
				
				if(scorecard.getPlayer().equals(player))
				{
					return scorecard;
				}
			}
		}
		
		return null;
	}


	
//	public String toString()
//	{
//		return DateUtil.toString(date) + " " + course;
//	}


}
