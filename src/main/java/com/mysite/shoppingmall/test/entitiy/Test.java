package com.mysite.shoppingmall.test.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name" , nullable = false , length = 20 , insertable=true)
	private String myName;
	
	@Column(insertable=true)
	private int myAge;
	
	@Column(insertable=true)
	private String myInfo;
	
	
	
	
}
