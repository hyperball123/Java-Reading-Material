package compstore;

import java.rmi.Naming;

import adpack.AddService;
import adpack.Address;
import billpay.BillPayment;
import compstore.emailpack.EmailComponent;
import compstore.rmipack.BusinessInterface;
import compstore.transportpack.LeadTimeCalculator;

public class RmiClient {
	public static void main(String[] args) throws Exception{
		
		BusinessInterface bi=(BusinessInterface)Naming.lookup("rmi://localhost:2000/zackriahshop");
		
		LeadTimeCalculator lt=(LeadTimeCalculator)bi.getZackriahStoreObject();
		
		lt.calculateLeadTime("aaaa");
		
		EmailComponent email=(EmailComponent)bi.getZackriahStoreObject();
		
		email.sendEmail("bla bla");
		
		AddService add=(AddService)bi.getZackriahStoreObject();
		add.changeAddress(new Address());
		
		BillPayment bp=(BillPayment)bi.getZackriahStoreObject();
		bp.payBill(100);
	}
}
