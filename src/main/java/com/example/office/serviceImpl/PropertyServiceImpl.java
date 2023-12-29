package com.example.office.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.PropertyVO;
import com.example.office.repo.PropertyRepo;
import com.example.office.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	@Autowired
	PropertyRepo propRepo;

	@Override
	public List<PropertyVO> getAllItems() {
		// TODO Auto-generated method stub
		return propRepo.findAll();
	}

	@Override
	public PropertyVO getItemsById(int id) {
		// TODO Auto-generated method stub
		return propRepo.findById(id).orElse(null);
	}

	@Override
	public PropertyVO createItems(PropertyVO propertyVO) {
		// TODO Auto-generated method stub
		return propRepo.save(propertyVO);
	}

	@Override
	public ResponseEntity<?> updateItems(int id, PropertyVO propertyVO) {
		PropertyVO propVO = propRepo.findById(id).get();
		propVO.setItems(propVO.getItems());
		propRepo.save(propVO);
		return ResponseEntity.ok().body("Updated Successfully");
	}

	@Override
	public ResponseEntity<?> deleteItems(int id) {
		propRepo.deleteById(id);
		return ResponseEntity.ok().body("Delete Successfully");
	}
}
