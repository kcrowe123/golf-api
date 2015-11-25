package com.golf.domain.player;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.scorecard.Scorecard;

/**
 * @author Keith  this is the player Entity.
 */
@Entity
@Table(name = "Player")
public class Player extends com.golf.domain.Entity implements Serializable {
    private static final int HASH_CODE_MULTIPLIER = 7;

    @Id
    @GeneratedValue
    @Column(name = "PLAYER_ID", nullable = false)
    private long id;
    
    @Column(name = "FIRST_NAME")
    private String firstName;
    
    @Column(name = "LAST_NAME")
    private String lastName;
    
    @Column(name = "SUFFIX")
    private String suffix;
    
    @AttributeOverrides({
    @AttributeOverride(name = "street", column = @Column(name = "STREET")),
    @AttributeOverride(name = "city", column = @Column(name = "CITY")),
    @AttributeOverride(name = "state", column = @Column(name = "STATE")),
    @AttributeOverride(name = "zipCode", column = @Column(name = "ZIP_CODE")) })
    private Address address;
    
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "player")
    private Set<Scorecard> scorecards;

    /** 
     * public no-arg constructor.
     */
    public Player()
    {

    }
    
    /**
     * @param firstName     <code>String</code>
     * @param lastName      <code>String</code>
     * @param suffix        <code>String</code>
     * @param address       <code>Address</code>
     * @param phoneNumber   <code>String</code>
     * @param emailAddress  <code>String</code>
     */
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
    
    /**
     * @return <code>Long</code>
     */
    public Long getId()
    {
        return id;
    }

    /**    
     * @return   <code>String</code>
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName     <code>String</code>
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**    
     * @return     <code>String</code>
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName  <code>String</code>
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**    
     * @return   <code>String</code>
     */
    public String getSuffix()
    {
        return suffix;
    }

    /**
     * @param suffix   <code>String</code>
     */
    public void setSuffix(String suffix)
    {
        this.suffix = suffix;
    }

    /**    
     * @return   <code>Address</code>
     */
    public Address getAddress()
    {
        return address;
    }

    /**
     * @param address  <code>Address</code>
     */
    public void setAddress(Address address)
    {
        this.address = address;
    }

    /**    
     * @return   <code>String</code>
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param phoneNumber   <code>String</code>
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**    
     * @return   <code>String</code>
     */    
    public String getEmailAddress()
    {
        return emailAddress;
    }

    /**
     * @param emailAddress   <code>String</code>
     */
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    
    /**    
     * @return   <code>Date</code>
     */    
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    /**
     * @param dateOfBirth   <code>Date</code>
     */
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    
    /**    
     * @return   <code>Set<Scorecard></code>
     */        
   public Set<Scorecard> getScorecards()
    {
        return scorecards;
    }
    
   /**
    * @param scorecards   <code>Set<Scorecard></code>
    */
    public void setScorecards(Set<Scorecard> scorecards)
    {
        this.scorecards = scorecards;
    }
   
    /**    
     * @param  scorecard  <code>Scorecard</code>
     */    
   public void addScorecard(Scorecard scorecard)
      {    
        scorecard.setPlayer(this);
        scorecards.add(scorecard);
        
    }
    
    /**
     * @return   <code>String</code>
     */
    @Transient
    public String getFullName()
    {
        StringBuilder fullName = new StringBuilder();
        
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
    
    /**
     * @param id   <code>Long</code>
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected void addEntityFieldsToEqualsBuilder(EqualsBuilder builder, Object obj) {
        Player rhs = (Player) obj;
        builder.append(lastName, rhs.lastName);
    }

    @Override
    protected int hashCodeMultiplier() {
        return HASH_CODE_MULTIPLIER;
    }

    @Override
    protected void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder) {
        builder.append(lastName);
    }

    @Override
    protected void addEntityFieldsToToStringBuilder(ToStringBuilder builder) {
        builder.append("lastName", lastName);
    }

}
