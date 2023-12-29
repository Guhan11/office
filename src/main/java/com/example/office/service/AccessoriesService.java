package com.example.office.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.office.entity.AccessoriesVO;

@Service
public interface AccessoriesService {

	public List<AccessoriesVO> getAllHolders();
	public AccessoriesVO getHolderssById(int id);
	public AccessoriesVO createHolders(AccessoriesVO accessoriesVO);
	public ResponseEntity<?> updateHolders(int id,AccessoriesVO accessoriesVO);
	public ResponseEntity<?> deleteHolders(int id);

	
	
}
