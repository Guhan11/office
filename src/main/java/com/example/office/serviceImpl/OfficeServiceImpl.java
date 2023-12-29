package com.example.office.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.OfficeVO;
import com.example.office.repo.OfficeRepo;
@Service
public class OfficeServiceImpl implements com.example.office.service.OfficeService{
@Autowired
OfficeRepo repo;
	@Override
	public List<OfficeVO> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public OfficeVO getAllEmployeeById(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public OfficeVO createEmployee(OfficeVO officeVO) {
		return repo.save(officeVO);
	}

	@Override
	public ResponseEntity<?> updateEmplopyee(int id,OfficeVO officeVO) {
		OfficeVO offvo = repo.findById(id).get();
		//bookvo.setYrOfPublish(bookVO.getYrOfPublish());
		//offvo.setIntime(offvo.getIntime());
		repo.save(offvo);
		 return ResponseEntity.ok().body("updated Succesfully");
	}

	@Override
	public ResponseEntity<?> deleteEmployee(int id) {
		 repo.deleteById(id);
		return ResponseEntity.ok().body("Deleted Succesfully");
	}

}
