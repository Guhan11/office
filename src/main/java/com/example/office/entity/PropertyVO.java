package com.example.office.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Company_properties")
public class PropertyVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String items;
	@ManyToOne
	@JoinColumn(name="Employee_id")
	@JsonBackReference  
	private AccessoriesVO access;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public AccessoriesVO getAccess() {
		return access;
	}
	public void setAccess(AccessoriesVO access) {
		this.access = access;
	}
	
	
	
	}

