package com.example.day9.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.day9.Models.Address;
public interface AddressRepo extends JpaRepository <Address,Long>{
}
