package mod1.day16;
//this is a implementation and not inheritance
public class MedicalCollege implements Doctor,Surgeon{
	@Override
	public void doCure() {
		System.out.println("alopathy cure is called....");
	}
	@Override
	public void doSurgery() {
		// TODO Auto-generated method stub
		System.out.println("alopathy surgery is called...");
	}
}
