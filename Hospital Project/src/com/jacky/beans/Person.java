package com.jacky.beans;

import com.jacky.utils.Utils;

public abstract class Person {
	private static final int MIN_AGE = 18;
	private static final int MAX_AGE = 120;
	private static int idCount = 0;
	
	private int id;
	private String name;
	private int age;
	
	public Person() {
		this.id = ++idCount;
		this.name = getClass().getSimpleName() + this.id;
		this.age = Utils.getRandomNumber(MIN_AGE,MAX_AGE);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", age: " + age+", ";
	}
	
	

}
