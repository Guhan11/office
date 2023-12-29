package com.example.office.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.PropertyVO;

@Service
public interface PropertyService {

	public List<PropertyVO> getAllItems();
	public PropertyVO getItemsById(int id);
	public PropertyVO createItems(PropertyVO propertyVO);
	public ResponseEntity<?> updateItems(int id,PropertyVO propertyVO);
	public ResponseEntity<?> deleteItems(int id);
}
