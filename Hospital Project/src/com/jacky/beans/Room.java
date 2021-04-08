package com.jacky.beans;

import java.util.Arrays;
import static com.jacky.utils.Utils.NEW_LINE;

public class Room {
	
	private static final int MAX_PATIENTS = 5;
	
	private int roomNumber;
	private Doctor doctor;
	private Nurse nurse;
	private Patient[] patients;
	
	public Room() {
		patients = new Patient[MAX_PATIENTS];
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Nurse getNurse() {
		return nurse;
	}
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	public Patient[] getPatients() {
		return patients;
	}
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	private String getPatientAsString() {
		StringBuilder sb = new StringBuilder();
		for (Patient patient : this.patients) {
			sb.append(patient);
			sb.append(NEW_LINE);
		}
		return sb.toString();
	}
	@Override
	public String toString() {
		return "\nroomNumber: " + roomNumber + "\ndoctor: " + doctor + "\nnurse: " + nurse + "\npatients:\n"
				+ getPatientAsString();
	}
	
	
	
	
	
	
}
