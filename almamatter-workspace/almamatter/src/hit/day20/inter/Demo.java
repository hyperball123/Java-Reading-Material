package hit.day20.inter;

import malik.MoleculeFramework;

public class Demo {
	public static void main(String[] args) {
		Object boleenATM=new ATM();
		
		Sbi sbiChennai=new Sbi();
		CanaraBank cab=new CanaraBank();
		
		MoleculeFramework.setInterface(Teller.class);
		MoleculeFramework.setInterface(Depositor.class);
		Teller tellerSbi=(Teller)MoleculeFramework.getObject(new Object[] {boleenATM,cab});
		
		System.out.println(tellerSbi.withDrawCash());
		
		Depositor depositInSbi=(Depositor)tellerSbi;
		depositInSbi.acceptCash(100);
	}
}
