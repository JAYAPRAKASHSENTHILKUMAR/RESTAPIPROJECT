package com.example.day9.Repo;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.day9.Models.Users;

public interface UsersRepo extends JpaRepository<Users,Long>{

}