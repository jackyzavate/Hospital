package com.jacky.tests;

import java.util.ArrayList;
import java.util.List;

import com.jacky.beans.Doctor;
import com.jacky.beans.Hospital;
import com.jacky.beans.Nurse;
import com.jacky.beans.Patient;
import com.jacky.beans.Room;
import com.jacky.utils.Utils;

import com.jacky.utils.Utils;
import com.jacky.beans.*;

public class Run {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital("Tel Hashomer");
		System.out.println(hospital);
		
		hospital.printStatistics();
		
	}

}
