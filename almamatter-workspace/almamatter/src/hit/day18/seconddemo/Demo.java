package hit.day18.seconddemo;

import malik.MoleculeFramework;

public class Demo {
	public static void main(String[] args) {
		Switch button=new Switch();
		
		Bulb philips=new Bulb();
		Ac panasonic=new Ac();
		
		MoleculeFramework.setInterface(OnOff.class);
		Object switchButton=MoleculeFramework.getObject(new Object[] {button,panasonic});
		
		OnOff bulbOnOff=(OnOff)switchButton;
		
		bulbOnOff.on();
		bulbOnOff.off();
	}
}
