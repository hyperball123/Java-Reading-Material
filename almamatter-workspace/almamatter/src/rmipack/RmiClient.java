package rmipack;

import java.rmi.Naming;

public class RmiClient {
	public static void main(String[] args) throws Exception{
		Business b=(Business)Naming.lookup("rmi://localhost:2000/mystockserver");
		
		Object obj=b.getObject();
		
		Stock stock=(Stock)obj;
		
		int price=stock.getStockPrice("wipro");
		
		System.out.println(price);
	}
}
