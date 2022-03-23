package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Seller {

	@Id
	private int seller_id;
	private String name;
	private String address;
	private String email;
    private String contact;
    
	@OneToMany(targetEntity = Catalog.class , cascade = CascadeType.ALL)
	@JoinColumn(name="fk_seller_id2",referencedColumnName = "seller_id")
	private List<Catalog> list_seller;
    
    
	public Seller() {
		super();
	}
	public int getId() {
		return seller_id;
	}
	public void setId(int id) {
		this.seller_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
