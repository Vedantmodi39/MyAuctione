package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
public class Auctioneer {
	
	@Id
	private int id;
	//private int event_id;
	private String name;
	private String password;
	private String email;
    private String contact;
    
	@OneToMany(targetEntity = AuctionEvent.class , cascade = CascadeType.ALL)
	@JoinColumn(name="event_id2",referencedColumnName = "id")
	private List<AuctionEvent> list_auction_iitems;
     
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public int getEvent_id() {
//		return event_id;
//	}
//	public void setEvent_id(int event_id) {
//		this.event_id = event_id;
//	}
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
