package hit.day18.firstdemo;

public class AlopathyMedicalCollege implements Doctor,Nurse{
	@Override
	public void doCure() {
		System.out.println("logic to cure in alopathy is written here.....");
	}
	@Override
	public void doCare() {
		System.out.println("do care by alopathy nurse...........");
	}
}
