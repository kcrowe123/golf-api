package com.golf.domain.skin;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.Entity;
import com.golf.domain.day.Day;
import com.golf.domain.scorecard.Scorecard;

/**
 * Represents a Skins Game
 * 
 * @author Z900247
 * 
 * @hibernate.class  table="skin"
 */
public class Skins extends Entity
{
	private String name;
	private Day day;
	private Set scorecards;
	
	public Skins()
	{
		
	}
	
	public Skins(String name, Day day)
	{
		this.name = name;
		this.day = day;
	}
	
	/**
	 * The getter method for this Skins Game identifier.
	 * 
	 * @hibernate.id column = "SKIN_ID" generator-class="native"
	 */
	public Long getId()
	{
		return super.getId();
	}
	
	/**
	 * The getter method for Skins Game name
	 * 
	 * @return date
	 * 
	 * @hibernate.property column = "NAME"
	 */
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns the day.
	 * 
	 * @return
	 * @hibernate.many-to-one
	 *  column="DAY_ID"
	 *  not-null="true"
	 * @hibernate.column
	 *  name="DAY_ID"
	 *  not-null="true"
	 */
	public Day getDay()
	{
		return day;
	}

	public void setDay(Day day)
	{
		this.day = day;
	}
	
	/**
	 * @return
	 * @hibernate.set
	 * table="SKIN_SCOREDARD"
	 * lazy="true"
	 * @hibernate.collection-key
	 * column="SKIN_ID"
	 * @hibernate.collection-many-to-many
	 * column="SCORECARD_ID"
	 * class="com.golf.domain.scorecard.Scorecard"
	 */
	public Set getScorecards()
	{
		if(scorecards == null)
		{
			scorecards = new HashSet();
		}
		
		return scorecards;
	}

	public void setScorecards(Set scorecards)
	{
		this.scorecards = scorecards;
	}

	public void addScorecard(Scorecard scorecard)
	{
		getScorecards().add(scorecard);
	}

	@Override
	protected void addEntityFieldsToEqualsBuilder(EqualsBuilder builder,
			Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addEntityFieldsToToStringBuilder(ToStringBuilder builder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int hashCodeMultiplier() {
		// TODO Auto-generated method stub
		return 0;
	}
}
