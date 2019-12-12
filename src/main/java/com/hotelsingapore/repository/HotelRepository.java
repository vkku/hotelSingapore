package com.hotelsingapore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<HotelRecord, String> {
	/*
	 * void saveAll(List<HotelRecord> hotels);
	 * 
	 * List<HotelRecord> findAll();
	 */
}
