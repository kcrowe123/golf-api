package com.golf.domain.player;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;



import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.scorecard.Scorecard;
import com.golf.domain.tournament.Tournament;


@Entity
@Table(name="Player")
public class Player extends com.golf.domain.Entity implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "PLAYER_ID", nullable = false)
	private long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name="SUFFIX")
	private String suffix;
	
	@AttributeOverrides({
    @AttributeOverride(name = "street", column = @Column(name = "STREET")),
    @AttributeOverride(name = "city", column = @Column(name = "CITY")),
    @AttributeOverride(name = "state", column = @Column(name = "STATE")),
    @AttributeOverride(name = "zipCode", column = @Column(name = "ZIP_CODE")) })
	private Address address;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "player")
	private Set<Scorecard> scorecards;

	public Player()
	{

	}

	public Player(String firstName, String lastName, String suffix,
			Address address, String phoneNumber, String emailAddress)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	

	public Long getId()
	{
		return id;
	}

	
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * The setter method for this Player's firstName
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * The setter method for this Player's lastName
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	
	public String getSuffix()
	{
		return suffix;
	}

	/**
	 * The setter method for this Player's suffix.
	 */
	public void setSuffix(String suffix)
	{
		this.suffix = suffix;
	}

	
	public Address getAddress()
	{
		return address;
	}

	/**
	 * The setter method for this Player's address.
	 */
	public void setAddress(Address address)
	{
		this.address = address;
	}

	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * The setter method for this Player's phoneNumber.
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	
	public String getEmailAddress()
	{
		return emailAddress;
	}

	/**
	 * The setter method for this Player's emailAddress.
	 */
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}

	
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
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
		scorecard.setPlayer(this);
		scorecards.add(scorecard);
		
	}

	@Transient
	public String getFullName()
	{
		StringBuffer fullName = new StringBuffer();
		
		fullName.append(lastName);

		if (suffix != null && suffix.length() > 0)
		{
			fullName.append(" "); 
			fullName.append(suffix);
		}
		
		fullName.append(", ");
		fullName.append(firstName);

		return fullName.toString();
	}

	public void setId(long id) {
		this.id = id;
	}

    @Override
    protected void addEntityFieldsToEqualsBuilder(EqualsBuilder builder, Object obj) {
    	Player rhs = (Player) obj;
        builder.append(lastName, rhs.lastName);
    }

    @Override
    protected int hashCodeMultiplier() {
        return 7;
    }

    @Override
    protected void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder) {
        builder.append(lastName);
    }

    @Override
    protected void addEntityFieldsToToStringBuilder(ToStringBuilder builder) {
        builder.append("lastName", lastName);
    }

//	public boolean equals(Object obj)
//	{
//		Player player = (Player) obj;
//		
//		return this.getId() == player.getId() && this.getFullName().equals(player.getFullName());
//	}
//
//	public String toString()
//	{
//		return this.getFullName();
//	}




	
	



}
