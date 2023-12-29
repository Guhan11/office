package com.example.office.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Accessories")
public class AccessoriesVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String holdername;
	@OneToMany(mappedBy = "access",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<PropertyVO> property;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public List<PropertyVO> getItems() {
		return property;
	}
	public void setItems(List<PropertyVO> items) {
		this.property = items;
	}
	
	
	
	
	
}
