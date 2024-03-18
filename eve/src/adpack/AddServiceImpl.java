package adpack;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServiceImpl implements AddService,Serializable{
	public AddServiceImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
@Override
public void changeAddress(Address add)  {
	System.out.println(add);
	System.out.println("address changed...............................");
	
}
}
