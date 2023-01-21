package com.cache.example.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id", unique = true, nullable = false)
	    private int userId;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "age")
	    private int age;

	    @Column(name = "address")
	    private String address;

	    public User() {}

	    public User(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
		}
	    
	    
}
