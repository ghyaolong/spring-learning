package com.yao.bean;

import java.math.BigDecimal;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/7/13 11:37
 * @DESC
 */
public class Person {

	private void init(){
		System.out.println("perons init");
	}

	private String name = "Micheal";
	private int age;
	private BigDecimal salary;

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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Cat getCat() {
		return cat;
	}

	private Cat cat;

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void say() {
		System.out.println("hello person");
	}
}
