package _04_hospital;

import java.util.ArrayList;

public class Doctor{

	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void assignPatient(Patient p) throws DoctorFullException{
		if(patients.size() >= 3) throw new DoctorFullException();
		patients.add(p);
	}
	ArrayList<Patient> getPatients() {
		return patients;
	}
	
	boolean makesHouseCalls() {
		return false;
	}
	boolean performsSurgery() {
		return false;
	}
	
	void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	
	
}