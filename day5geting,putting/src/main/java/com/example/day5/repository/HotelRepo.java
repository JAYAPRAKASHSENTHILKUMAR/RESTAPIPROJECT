package com.example.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.model.HotelModel;

public interface HotelRepo extends JpaRepository<HotelModel, Integer>{

}
