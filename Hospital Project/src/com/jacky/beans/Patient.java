package com.jacky.beans;

public class Patient extends Person {
	private Disease disease;

	public Patient() {
		super();
		disease = new Disease();
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return super.toString() + "disease: " + disease;
	}
	
	
	
	
}
