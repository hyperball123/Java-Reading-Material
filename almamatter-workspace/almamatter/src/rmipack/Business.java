package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Business extends Remote{
	public Object getObject()throws RemoteException;
}
