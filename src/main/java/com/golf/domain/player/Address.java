package com.golf.domain.player;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;



/**
 * This is the Address class.
 * @author Keith
 *
 */
@Embeddable
public class Address {
    
    @Column(name = "STREET", nullable = true)
    private String street;
    
    @Column(name = "CITY", nullable = true)
    private String city;
    
    @Column(name = "STATE", nullable = true)
    private String state;
    
    @Column(name = "ZIP_CODE", nullable = true)
    private String zipCode;

/**
 * No Arg constructor for Address.
 */
    public Address() {

    }
    
    /**
     * @param street  <code>String</code>
     * @param city    <code>String</code>
     * @param state   <code>String</code>
     * @param zipCode <code>String</code>
     */
    public Address( String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    /**
     * @return <code>String</code>
     */
    @Transient
    public String getMailingAddress() {
        return street + " " + city + ", " + state + " " + zipCode;
    }
    
    /**
     * @return <code>String</code>
     */
    public String getStreet() {
        return street;
    }
    
    /**
     * @param street   <code>String</code>
     */
    public void setStreet(String street) {
        this.street = street;
    }
    
    /**
     * @return <code>String</code>
     */
    public String getCity() {
        return city;
    }
    
    /**
     * @param city  <code>String</code>
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * @return <code>String</code>
     */
    public String getState() {
        return state;
    }
    
    /**
     * @param state  <code>String</code>
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * @return <code>String</code>
     */
    public String getZipCode() {
        return zipCode;
    }
    
    /**
     * @param zip  <code>String</code>
     */
    public void setZipCode(String zip) {
        this.zipCode = zip;
    }
}
