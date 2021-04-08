package com.jacky.beans;

import com.jacky.utils.Utils;

public class Doctor extends Person{
	private int roomNumber;
	private DiseaseDescription diseaseSpeciallity;
	
	public Doctor() {
		super();
		this.diseaseSpeciallity = Utils.getRandomDisease();
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public DiseaseDescription getDiseaseSpeciallity() {
		return diseaseSpeciallity;
	}

	public void setDiseaseSpeciallity(DiseaseDescription diseaseSpeciallity) {
		this.diseaseSpeciallity = diseaseSpeciallity;
	}

	@Override
	public String toString() {
		return super.toString() +"roomNumber: " + roomNumber + ", diseaseSpeciallity: " + diseaseSpeciallity;
	}
	
	
	
}
