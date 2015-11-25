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


/**
 * @author Keith   This is Flight Entity.
 */
@Entity
@Table(name = "FLIGHT")
public class Flight
{
    @Id
    @GeneratedValue
    @Column(name = "FLIGHT_ID", nullable = false)
    private Long id;
    
    @Column(name = "FLIGHT_NM", nullable = false)
    private String name;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "FLIGHT_SCORECARD", joinColumns = { @JoinColumn(name = "FLIGHT_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SCORECARD_ID", nullable = false, updatable = false) })
    private Set<Scorecard> scorecards;
    
    /**
     * public no-arg constructor.
     */
    public Flight()
    {
        
    }
    
    /**
     * @return  <code>Long</code>
     */
    public Long getId()
    {
        return id;
    }
    
    /**
     * @param id  <code>Long</code>
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return   <code>String</code>
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @param name  <code>String</code>
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @return  <code>Set<Scorecard></code>
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

    
}
