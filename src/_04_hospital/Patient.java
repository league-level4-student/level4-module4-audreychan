package _04_hospital;

public class Patient {

	boolean pulseChecked = false;
	
	void checkPulse() {
		pulseChecked = true;
	}
	
	boolean feelsCaredFor() {
		return pulseChecked;
	}
	
}
