package com.mysite.shoppingmall.test.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {

	@Id
	private Long id;
	
	private String name;
	private int age;
}
