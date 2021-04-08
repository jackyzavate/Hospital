package com.jacky.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jacky.beans.DiseaseDescription;
import com.jacky.beans.Patient;
import com.jacky.beans.Person;





public class HospitalStatistics {

	public static void printAmounts(int doctors, int patients, int nurses) {
		System.out.println("Doctors: "+ doctors);
		System.out.println("Patients: "+ patients);
		System.out.println("Nurses: "+ nurses);
		System.out.println();
	}
	
	public static void avgTimeToCure (List<Patient> patients) {
		double sum = 0;
		for (Patient patient : patients) {
			sum += patient.getDisease().getTimeToCure();
				
		}
		System.out.println("Average time to cure is " + sum/patients.size() + " days");
		System.out.println();
	}
	
	public static void avgTimeTocurePerDisease (List<Patient> patients) {
		Map<DiseaseDescription, Integer> numberOfPatientPerDisease = new HashMap<>();
		Map<DiseaseDescription, Double> sumOfTimeToCurePerDisease = new HashMap<>();
//		
//		for(DiseaseDescription diseaseDescription : DiseaseDescription.values()) {
//			numberOfPatientPerDisease.put(diseaseDescription, 0);
//			sumOfTimeToCurePerDisease.put(diseaseDescription, 0.0);	
//		}
		
		for (Patient patient : patients) {
			DiseaseDescription dd = patient.getDisease().getDiseaseDescription();
			double patientDaysToCure = (double) patient.getDisease().getTimeToCure();
			numberOfPatientPerDisease.put(dd, numberOfPatientPerDisease.getOrDefault(dd, 0)+1);
			sumOfTimeToCurePerDisease.put(dd, sumOfTimeToCurePerDisease.getOrDefault(dd, 0.0) + patientDaysToCure);
			//numberOfPatientPerDisease.put(dd, numberOfPatientPerDisease.get(dd)+1);
		}
		
		for(Map.Entry<DiseaseDescription, Double> entry : sumOfTimeToCurePerDisease.entrySet()) {
			DiseaseDescription diseaseDescription = entry.getKey();
			int totalPatients = numberOfPatientPerDisease.get(diseaseDescription);
			System.out.println(String.format("%s: %.2f", diseaseDescription.name(), (entry.getValue() / totalPatients)));
			//System.out.println();
		}
		System.out.println();
	}
		//Bonus Round 1 - Not Working Properly, i need to review it 
	public static void avgPatientAgePerDisease (List<Patient> patients) {
			Map<DiseaseDescription, Integer> numberOfPatientPerDisease = new HashMap<>();
			Map<DiseaseDescription, Double> avgOfPatientAge = new HashMap<>();
			
			for (Patient patient : patients) {
				DiseaseDescription dd = patient.getDisease().getDiseaseDescription();
				double patientAge = (double) patient.getAge();
				numberOfPatientPerDisease.put(dd, numberOfPatientPerDisease.getOrDefault(dd, 0)+1);
				avgOfPatientAge.put(dd, avgOfPatientAge.getOrDefault(dd, 0.0) + patientAge);
				
			for (Map.Entry<DiseaseDescription, Double> entry : avgOfPatientAge.entrySet()) {
				DiseaseDescription diseaseDescription = entry.getKey();
				int totalPatients = numberOfPatientPerDisease.get(diseaseDescription);
				System.out.println(String.format("%s: %.2f", diseaseDescription.name(), (entry.getValue()/totalPatients)));
				
			}
				
			}
		}
	// Bonus Round 2 and the remaining rounds - I need to continue working on it when i get back from the hospital (tonight hopeful)
//	public static void mostCummonDisease (List<Patient> patients) {
//		
//		
//	}
}
