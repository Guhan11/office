package com.example.office.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.AccessoriesVO;
import com.example.office.repo.AccessoriesRepo;
import com.example.office.service.AccessoriesService;

@Service
public class AccessoriesServiceImpl implements AccessoriesService{

	@Autowired
	AccessoriesRepo accRepo;

	@Override
	public List<AccessoriesVO> getAllHolders() {		//get
		// TODO Auto-generated method stub
		return accRepo.findAll();
	}

	@Override
	public AccessoriesVO getHolderssById(int id) {
		// TODO Auto-generated method stub				//getById
		return accRepo.findById(id).orElse(null);
	}

	@Override
	public AccessoriesVO createHolders(AccessoriesVO accessoriesVO) {
		// TODO Auto-generated method stub				 //post
		return accRepo.save(accessoriesVO);
	}

	@Override
	public ResponseEntity<?> updateHolders(int id, AccessoriesVO accessoriesVO) {
		AccessoriesVO accessVO = accRepo.findById(id).get();
		accessVO.setHoldername(accessVO.getHoldername());
		accRepo.save(accessVO);
		return ResponseEntity.ok().body("Updated Successfully"); 
	}

	@Override
	public ResponseEntity<?> deleteHolders(int id) {
		// TODO Auto-generated method stub
		 accRepo.deleteById(id);
		 return ResponseEntity.ok().body("Deleted Successfully");
	}
	
	
}
