package com.sql.Sqlproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detail")
public class details5 {
	private String name;
	
	@Id// we use in One.java there as second parameter we use the datatype of Id
	@GeneratedValue
	private int id;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public details5(String name, int id) {
		super();
		this.name = name;
		id = id;
	}
	public details5() {
		super();
	}
	@Override
	public String toString() {
		return "details5 [name=" + name + ", Id=" + id + "]";
	}

}
