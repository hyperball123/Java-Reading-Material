package rmipack;

import java.io.Serializable;
import java.rmi.RemoteException;

public class StockImpl implements Stock{
	@Override
	public int getStockPrice(String cname) throws RemoteException {
		if(cname.equals("wipro")) {
			return 100;
		}
		else {
			return 50;
		}
	}
}
