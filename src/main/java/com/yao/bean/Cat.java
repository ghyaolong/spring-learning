package com.yao.bean;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/7/13 15:16
 * @DESC
 */
public class Cat {

	public void init(){
		System.out.println("cat init ......");
	}

	private String name;
	private int age;
	private String color;
	private String variety;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public Person getPerson() {
		return person;
	}

	private Person person;

	public void setPerson(Person person) {
		this.person = person;
	}
}
