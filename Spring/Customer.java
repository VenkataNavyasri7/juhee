package com.pack.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Customer",schema="test")
public class Customer {
	@Id
	@Column(name="Id")
	 private Integer id;
	 @Column(name="name")
	 @NotEmpty
	 @Size(min=3,max=20)

	 private String name;
	 @Column(name="address")
	 @Size(min=5,max=20)
	 private String address;
	 @Column(name="age")
	 @NotNull
	 @Min(18)
	 @Max(50)
	 private Integer age;
	 @Column(name="salary")
	 @NotNull
	 private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Customer(Integer id, String name, String address, Integer age, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public Customer() {
		super();
	}
	 

}
