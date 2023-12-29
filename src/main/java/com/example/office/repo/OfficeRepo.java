package com.example.office.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.office.entity.OfficeVO;
@Repository
public interface OfficeRepo extends JpaRepository<OfficeVO, Integer>{

}
