package com.example.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.office.entity.OfficeVO;
import com.example.office.service.OfficeService;


@RestController
@RequestMapping("/office")

public class OfficeController {
	@Autowired
	OfficeService officeService;
	
@GetMapping
	public List<OfficeVO> getAllEmployee() {
	List<OfficeVO> officeVO = officeService.getAllEmployee();
	return officeVO;}

@GetMapping("/{id}")
	public OfficeVO getAllEmployeeById(@PathVariable int id) {
	OfficeVO officeVO = officeService.getAllEmployeeById(id);
	return officeVO;}

@PostMapping
	public OfficeVO createEmployee(@RequestBody OfficeVO officeVO) {
	OfficeVO updatedOfficeVO = officeService.createEmployee(officeVO);
	return updatedOfficeVO;}

@PutMapping("/{id}")
	public ResponseEntity<?> updateEmplopyee(@PathVariable int id,@RequestBody OfficeVO officeVO){
	return officeService.updateEmplopyee(id,officeVO);}

@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id){
	return officeService.deleteEmployee(id);}
}