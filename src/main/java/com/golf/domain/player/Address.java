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
    
	@Column(name="STREET", nullable = true)
    private String street;
    
	@Column(name="CITY", nullable = true)
    private String city;
    
	@Column(name="STATE", nullable = true)
    private String state;
    
	@Column(name="ZIP_CODE", nullable = true)
    private String zipCode;

/**
 * No Arg constructor for Address.
 */
    public Address() {

    }

    public Address( String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Transient
	public String getMailingAddress(){
		return street + " " + city + ", " + state + " " + zipCode;
	}

	public String getStreet(){
		return street;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getCity(){
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	@Column(name="ZIP_CODE", nullable = true)
	public String getZipCode(){
		return zipCode;
	}

	public void setZipCode(String zip){
		this.zipCode = zip;
	}
}
