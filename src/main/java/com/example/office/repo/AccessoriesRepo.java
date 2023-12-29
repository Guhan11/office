package com.example.office.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.office.entity.AccessoriesVO;
@Repository
public interface AccessoriesRepo extends JpaRepository<AccessoriesVO, Integer>{

}
