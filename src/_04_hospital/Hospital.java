package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	void addPatient(Patient p){
		patients.add(p);
	}
	ArrayList<Patient> getPatients(){
		return patients;
	}
	
	void assignPatientsToDoctors() {
		
		for(int i = 0; i < doctors.size(); i ++) {
			for(int j = 0; j < 3; j++) {
				try {
					if(i*3+j < patients.size())doctors.get(i).assignPatient(patients.get(i*3+j));
					else break;
					System.out.println("patient " + (i*3+j) + " assigned to doctor " + i);
				} catch (DoctorFullException e) { 
					System.out.println("error");
					break;
				}
			}
		}
	}
}
