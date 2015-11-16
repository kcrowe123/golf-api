package com.golf.domain.flight;

import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.Entity;

/**
 * Represents a Flight
 * 
 * @author Z900247
 * 
 * @hibernate.class  table="flight"
 */
public class Flight extends Entity
{
	private String name;
	
	private Set scorecards;
	
	public Flight()
	{
		
	}
	
	/**
	 * The getter method for this Flight's identifier.
	 * 
	 * @hibernate.id column = "FLIGHT_ID" generator-class="native"
	 */
	public Long getId()
	{
		return super.getId();
	}
	
	/**
	 * @return
	 * @hibernate.property
	 *  column = "FLIGHT_NM"
	 * @hibernate.column
	 *  name="FLIGHT_NM"
	 *  not-null="true"
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
	 * @return
	 * @hibernate.set
	 * table="FLIGHT_SCORECARD"
	 * lazy="true"
	 * @hibernate.collection-key
	 * column="FLIGHT_ID"
	 * @hibernate.collection-many-to-many
	 * column="SCORECARD_ID"
	 * class="com.golf.domain.scorecard.Scorecard"
	 */
	public Set getScorecards()
	{
		return scorecards;
	}

	public void setScorecards(Set scorecards)
	{
		this.scorecards = scorecards;
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
