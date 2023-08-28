package com.example.day8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel,Integer>{

}