package com.example.office.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.office.entity.PropertyVO;
@Repository
public interface PropertyRepo extends JpaRepository<PropertyVO, Integer>{

}
