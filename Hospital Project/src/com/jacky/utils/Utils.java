package com.jacky.utils;

import java.util.List;
import java.util.Stack;

import com.jacky.beans.DiseaseDescription;
import com.jacky.beans.Doctor;
import com.jacky.beans.Nurse;
import com.jacky.beans.Patient;
import com.jacky.beans.Room;

import static com.jacky.beans.Hospital.ROOMS_NUMBER;
import static com.jacky.beans.Hospital.DOCTORS_NUMBER;
import static com.jacky.beans.Hospital.NURSES_NUMBER;
import static com.jacky.beans.Hospital.PATIENTS_NUMBER;

public class Utils {
	
	public static final String NEW_LINE = "\n";
	//Generic random function
	public static int getRandomNumber(int lowerBound, int higherBound) {
		return (int)(Math.random() *(higherBound - lowerBound +1) +lowerBound);
	}
	
	public static DiseaseDescription getRandomDisease() {
		return DiseaseDescription.values()[(int)(Math.random()*DiseaseDescription.values().length)];
	}
	
	public static int generateAge() {
		return getRandomNumber(18,120);
	}
	
	public static void generateRooms(Room[] rooms, int amount) {
		for (int i = 0; i < amount; i++) {
			rooms[i] = new Room();
		}
	}
	
	public static void generateDoctors(List<Doctor> doctors, int amount) {
		for (int i = 0; i < amount; i++) {
			doctors.add(new Doctor());
		}
	}
	
	public static void generateNurses(List<Nurse> nurses, int amount) {
		for (int i = 0; i < amount; i++) {
			nurses.add(new Nurse());
		}
	}
	
	public static void generatePatients(List<Patient> patients, int amount) {
		for (int i = 0; i < amount; i++) {
			patients.add(new Patient());
		}
	}

	public static void initRooms(Room[] rooms, List<Doctor> doctors, List<Nurse> nurses, List<Patient> patients) {
		Stack<Patient> pStack = new Stack<>();
		pStack.addAll(patients);
		
		for (int i = 0; i < ROOMS_NUMBER; i++) {
			rooms[i].setRoomNumber(i+1);
			attachDoctorToRoom(rooms[i], doctors);
			attachPatientsToRoom(rooms[i], pStack);
			attachNurseToRoom(rooms[i], nurses);
		}
		
	}

	private static void attachNurseToRoom(Room room, List<Nurse> nurses) {
		for (Nurse nurse : nurses) {
			if(nurse.addRoom(room.getRoomNumber())) {
				room.setNurse(nurse);
				return;
			}
		}
	}

	private static void attachPatientsToRoom(Room room, Stack<Patient> patientsStack) {
		Patient[] patients = new Patient[5];
		for (int i = 0; i < patients.length; i++) {
			if(!patientsStack.isEmpty()) {
				patients[i]= patientsStack.pop(); 
			}
		}
		room.setPatients(patients);
		
	}

	private static void attachDoctorToRoom(Room room, List<Doctor> doctors) {
		for (Doctor doctor : doctors) {
			if(doctor.getRoomNumber() == 0) {
				doctor.setRoomNumber(room.getRoomNumber());
				room.setDoctor(doctor);
				return;
			}
		}
	}
	
	
	
}
