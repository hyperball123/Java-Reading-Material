package mod1.day16;

import malik.MoleculeFramework;

public class ClassesAndObjects22 {
	public static void main(String[] args) {
		Object shoiab=new Human();
		
		MedicalCollege alopathy=new MedicalCollege();
		AyurvedMedicalCollege ayush=new  AyurvedMedicalCollege();
		
		JetAcademy jet=new JetAcademy();
		
		
		/*
		 * We declare roles - requirements of a entity
		 * we declare them as interfaces
		 * then we provide implementations for the rules in roles
		 * 
		 * next, we should subject the objects into those implementations.
		 * 
		 */
		//how to do subjects in JAVA ?
		//For subjection I will be using Molecule Framework - developed by Shoiab
		//Step1 
		MoleculeFramework.setInterface(Doctor.class);
		MoleculeFramework.setInterface(Surgeon.class);

		//step2
		shoiab=MoleculeFramework.getObject(new Object[] {alopathy});
		
		Doctor doctorShoiab=(Doctor)shoiab;
		doctorShoiab.doCure();
		
		Surgeon surgeonShoiab=(Surgeon)shoiab;
		surgeonShoiab.doCure();
		surgeonShoiab.doSurgery();
		
		MoleculeFramework.setInterface(Pilot.class);
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,jet});
		
		
		Pilot pilotShoiab=(Pilot)shoiab;
		pilotShoiab.doFly();
		surgeonShoiab=(Surgeon)shoiab;
		surgeonShoiab.doCure();
		surgeonShoiab.doSurgery();
	}
}

