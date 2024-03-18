package hit.day18.seconddemo;

public class Bulb implements OnOff{
	@Override
	public void off() {
		System.out.println("bulb switched off...........");
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("bulb switched on.............");
	}
}
