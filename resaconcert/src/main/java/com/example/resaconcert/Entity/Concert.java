package com.example.resaconcert.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concert {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 Long id;
	 String name;
	 
	 public Concert() {}
	 
	 public Concert(Long id,String name) {
		 this.id = id;
		 this.name = name;
	 }
	 
	 

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}	
