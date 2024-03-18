package rmipack;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stock extends Serializable{
	public int getStockPrice(String cname)throws RemoteException;
}
