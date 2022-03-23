package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Catalog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
     
     private int event_id;
     private int lot_id;
     private int start_bid;
     private int seller_id;
     private int bidder_id;
     private String descc;
     private String name;
     private String image;
     //private boolean isSold=false;
     
     
     
     public Catalog() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getDesc() {
		return descc;
	}
	public void setDesc(String desc) {
		this.descc = desc;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public int getStart_bid() {
		return start_bid;
	}
	public void setStart_bid(int start_bid) {
		this.start_bid = start_bid;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getBidder_id() {
		return bidder_id;
	}
	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}
//	public boolean isSold() {
//		return isSold;
//	}
//	public void setSold(boolean isSold) {
//		this.isSold = isSold;
//	}
//	




     

}
