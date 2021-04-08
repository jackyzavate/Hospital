package com.jacky.beans;

public enum DiseaseDescription {
	TUBERCULOSIS(0),
	PNEUMONIA(1),
	COVID19(2),
	FRACTURE(3),
	CARDIO(4);
	
	private int value;

	DiseaseDescription(int num) {
		this.value = num;
	}
	
	private int getValue() {
		return this.value;
	}
	
	
	
	
}
