package com.golf.domain.skin;

import java.util.HashSet;
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
import com.golf.domain.scorecard.Scorecard;

/**
 * @author Keith This is the Skins domain object.
 */
@Entity
@Table(name = "SKIN")
public class Skins
{
    
    @Id
    @GeneratedValue
    @Column(name = "SKIN_ID", nullable = false)
    private long id;
    
    @Column(name = "NAME")
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAY_ID", nullable = false)
    private Day day;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SKIN_SCORECARD", joinColumns = { @JoinColumn(name = "SKIN_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) })
    private Set<Scorecard> scorecards;
    
    /**
     * public no-arg constructor.
     */
    public Skins()
    {
        
    }
    
    /**
     * @param name  <code>String</code>
     * @param day   <code>Day</code>
     */
    public Skins(String name, Day day)
    {
        this.name = name;
        this.day = day;
    }
    
    /**
     * @return   <code>Long</code>
     */
    public Long getId()
    {
        return id;
    }
    
    /**
     * @return   <code>String</code>
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name   <code>String</code>
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return  <code>Day</code>
     */
    public Day getDay()
    {
        return day;
    }
    
    /**
     * @param day   <code>Day</code>
     */
    public void setDay(Day day)
    {
        this.day = day;
    }
    
    /**
     * @return   <code>Set<Scorecard></code>
     */
    public Set<Scorecard> getScorecards()
    {
        if (scorecards == null)
        {
            scorecards = new HashSet<Scorecard>();
        }
        
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
     * @param scorecard   <code>Scorecard</code>
     */
    public void addScorecard(Scorecard scorecard)
    {
        getScorecards().add(scorecard);
    }


}
