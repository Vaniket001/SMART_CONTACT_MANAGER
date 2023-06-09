package com.scm.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private String role;
	
	private boolean enabled;
	
	private String imageUrl;
	
	@Column(length= 500)
	private String about;
	
	@OneToMany(mappedBy="user",cascade= CascadeType.ALL, fetch= FetchType.LAZY)
	private List<Contact> contacts=new ArrayList<>();

}
