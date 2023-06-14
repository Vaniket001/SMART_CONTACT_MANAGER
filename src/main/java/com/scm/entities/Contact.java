package com.scm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cid;
	
	private String name;
	
	private String secondName;
	
	private String work;
	
	private String email;
	
	private String phone;
	
	private String image;
	
	@Column(length= 1000)
	private String description;
	
	@ManyToOne
	private User user;
}
