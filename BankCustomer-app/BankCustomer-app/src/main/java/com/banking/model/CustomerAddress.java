package com.banking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer_address")
public class CustomerAddress {
	@Id
	private String addId;
	private String doorNo;
    private String street;
	private String state;
	private String country;
	public CustomerAddress(String addId, String doorNo, String street, String state, String country) {
		super();
		this.addId = addId;
		this.doorNo = doorNo;
		this.street = street;
		this.state = state;
		this.country = country;
	}
	public CustomerAddress() {
		super();
	}
	public String getAddId() {
		return addId;
	}
	public void setAddId(String addId) {
		this.addId = addId;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CustomerAddress [addId=" + addId + ", doorNo=" + doorNo + ", street=" + street + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	

}
