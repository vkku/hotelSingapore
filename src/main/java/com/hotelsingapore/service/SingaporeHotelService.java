package com.hotelsingapore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelsingapore.repository.HotelRecord;
import com.hotelsingapore.repository.HotelRepository;

@Service
public class SingaporeHotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	public List<HotelRecord> getHotelRecords() {
		return (List<HotelRecord>) hotelRepository.findAll();
	}

}
