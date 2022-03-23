package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Bidder {
	
	@Id
	private int bid_id;
	private String name;
	private String password;
	private String email;
    private String contact;
    
    
	@OneToMany(targetEntity = Catalog.class , cascade = CascadeType.ALL)
	@JoinColumn(name="fk_Bidder_id2",referencedColumnName = "bid_id")
	private List<Catalog> list_bid;
    
	public int getId() {
		return bid_id;
	}
	public void setId(int id) {
		this.bid_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
    
   

}
