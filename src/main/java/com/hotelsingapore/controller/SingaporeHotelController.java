package com.hotelsingapore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hotelsingapore.repository.HotelRecord;
import com.hotelsingapore.repository.HotelRepository;

@RestController
public class SingaporeHotelController {
	
	@Autowired
	HotelRepository hotelRepository;

    @GetMapping(value = "/getRecords")
    public ResponseEntity<String> fetchAllRecords() {
        List<HotelRecord> hotelData = (List<HotelRecord>) hotelRepository.findAll();
        ResponseEntity response = ResponseEntity.ok().body(hotelData);
        return response;
    }

}
