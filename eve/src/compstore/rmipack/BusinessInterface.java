package compstore.rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BusinessInterface extends Remote{
	public Object getZackriahStoreObject()throws RemoteException;
}
