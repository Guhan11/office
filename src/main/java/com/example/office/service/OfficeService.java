package com.example.office.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.OfficeVO;

@Service
public interface OfficeService {

	public List<OfficeVO> getAllEmployee();
	public OfficeVO getAllEmployeeById(int id);
	public OfficeVO createEmployee(OfficeVO officeVO);
	public ResponseEntity<?> updateEmplopyee(int id,OfficeVO officeVO);
	ResponseEntity<?> deleteEmployee(int id);
}
