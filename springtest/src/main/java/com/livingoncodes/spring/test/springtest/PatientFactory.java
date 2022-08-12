package com.livingoncodes.spring.test.springtest;

public class PatientFactory {
	public Patient createPatient(int id,String name) {
		System.out.println("using factory class to create patient");
		return new Patient(id,name);
	}
}
