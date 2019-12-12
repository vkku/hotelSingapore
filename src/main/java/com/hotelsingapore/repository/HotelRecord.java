package com.hotelsingapore.repository;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;

@Entity
public class HotelRecord {
	@Id
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("host_name")
	private String host_name;
	
	@JsonProperty("latitude")
	private Double latitude;
	
	@JsonProperty("longitude")
	private Double longitude;
	
	@JsonProperty("neighbourhood")
	private String neighbourhood;
	
	@JsonProperty("neighbourhood_group")
	private String neighbourhood_group;
	
	@JsonProperty("room_type")
	private String room_type;
	
	@JsonProperty("price")
	private Integer price;
}
