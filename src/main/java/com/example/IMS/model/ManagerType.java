package com.example.IMS.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manager_type")
public class ManagerType {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "manager_type_id")
	private long id;
	
	@Column(name = "manager_type_name")
	private String typeName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
