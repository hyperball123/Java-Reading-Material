package hit.day18.firstdemo;

import malik.MoleculeFramework;

public class Demo {
	public static void main(String[] args) {
		Object shoiab=new Human();
		Object roopa=new Human();
		
		AlopathyMedicalCollege amc=new AlopathyMedicalCollege();
		UnaniMedicalCollege umc=new UnaniMedicalCollege();
		
		
		//i should link/subject shoiab to medical college
		
		MoleculeFramework.setInterface(Doctor.class);
		Doctor doctorShoiab=(Doctor)MoleculeFramework.getObject(new Object[] {shoiab,umc});
		
		doctorShoiab.doCure();
		
		CookingAcademy master=new CookingAcademy();
		
		MoleculeFramework.setInterface(Chef.class);
		Chef chef=(Chef)MoleculeFramework.getObject(new Object[] {doctorShoiab,master});
		
		chef.cooking();
		
		doctorShoiab=(Doctor)chef;
		
		doctorShoiab.doCure();
		
		MoleculeFramework.setInterface(Nurse.class);
		Nurse nurseRoopa=(Nurse)MoleculeFramework.getObject(new Object[] {roopa,amc});
		nurseRoopa.doCare();
	}
}
