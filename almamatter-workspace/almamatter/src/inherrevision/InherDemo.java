package inherrevision;

import malik.MoleculeFramework;

public class InherDemo {
	public static void main(String[] args) {
		Object shoiab=new Human1();
		
		//subjection
		MoleculeFramework.setInterface(Teacher.class);
		Teacher teacherShoiab=(Teacher)MoleculeFramework.getObject(new Object[] {shoiab,new MagicTeachingCollege()});		
		teacherShoiab.teach();
	}
}

class BEDCollege implements Teacher,HeadMaster{
	@Override
	public void manageSchool() {
		System.out.println("teach managing a school");
	}
	@Override
	public void teach() {
		System.out.println("teach subject............");		
	}
}

class MagicTeachingCollege implements Teacher{
	public void teach() {
		System.out.println("teaching with craft.......");
	}
}