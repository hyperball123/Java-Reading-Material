package compstore;

import compstore.baseapp.MyApp;
import compstore.emailpack.EmailCompImpl;
import compstore.emailpack.EmailComponent;
import malik.MoleculeFramework;

public class Demo {
	public static void main(String[] args) {
		Object myapp=new MyApp();
		
		EmailCompImpl email=new EmailCompImpl();
		
		MoleculeFramework.setInterface(EmailComponent.class);
		
		myapp=MoleculeFramework.getObject(new Object[] {myapp,email});
		
		EmailComponent emailComp=(EmailComponent)myapp;
		
		emailComp.sendEmail("aaaaaa");
	}
}
