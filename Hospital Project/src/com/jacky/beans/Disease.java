package com.jacky.beans;

import com.jacky.utils.Utils;

public class Disease {
	
	private static final int MIN_TIME_TO_CURE = 3;
	private static final int MAX_TIME_TO_CURE = 21;
	
	private DiseaseDescription diseaseDescription;
	private int timeToCure;
	
	public Disease() {
		
		this.diseaseDescription = Utils.getRandomDisease();
		this.timeToCure = Utils.getRandomNumber(MIN_TIME_TO_CURE, MAX_TIME_TO_CURE);
		
	}

	public DiseaseDescription getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public int getTimeToCure() {
		return timeToCure;
	}

	public void setTimeToCure(int timeToCure) {
		this.timeToCure = timeToCure;
	}

	@Override
	public String toString() {
		return "diseaseDescription: " + diseaseDescription + ", timeToCure: " + timeToCure;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
