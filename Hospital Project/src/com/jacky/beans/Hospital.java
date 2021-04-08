package com.jacky.beans;

import static com.jacky.utils.Utils.NEW_LINE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jacky.utils.HospitalStatistics;
import com.jacky.utils.Utils;

public class Hospital {
	
	public static final int ROOMS_NUMBER = 10;
	public static final int DOCTORS_NUMBER = 10;
	public static final int NURSES_NUMBER = 10;
	public static final int PATIENTS_NUMBER = 50;
	
	private String name;
	private Room[] rooms;
	private List<Doctor> doctors = new ArrayList<>();
	private List<Nurse> nurses = new ArrayList<>();
	private List<Patient> patients = new ArrayList<>();
	
	public Hospital(String name) {
		this.name = name;
		rooms = new Room[ROOMS_NUMBER];
		Utils.generateRooms(rooms, ROOMS_NUMBER);
		Utils.generateDoctors(doctors, DOCTORS_NUMBER);
		Utils.generateNurses(nurses, NURSES_NUMBER);
		Utils.generatePatients(patients, PATIENTS_NUMBER);
		Utils.initRooms(rooms,doctors,nurses,patients);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	private String getRoomAsString() {
		StringBuilder sb = new StringBuilder();
		for (Room room : this.rooms) {
			sb.append(room);
			sb.append(NEW_LINE);
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Hospital name: " + name + "\nrooms: " +getRoomAsString();
	}
	
	public void printStatistics() {
		
		HospitalStatistics.printAmounts(doctors.size(), patients.size(), nurses.size());
		HospitalStatistics.avgTimeToCure(patients);
		HospitalStatistics.avgTimeTocurePerDisease(patients);
		HospitalStatistics.avgPatientAgePerDisease(patients);
	}
	
	
	

}
