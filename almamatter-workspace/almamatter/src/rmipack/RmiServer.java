package rmipack;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements Business{
	
	public RmiServer() throws Exception{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object getObject() throws RemoteException {
		MoleculeFramework.setInterface(Stock.class);
		Object obj=new Human();
		
		Object object=(Object)MoleculeFramework.getObject(new Object[] {obj,new StockImpl()});
		System.out.println(object);
		return object;
	}
	
	public static void main(String[] args)throws Exception {
		RmiServer obj=new RmiServer();
		
		LocateRegistry.createRegistry(2000);
		Naming.bind("rmi://localhost:2000/mystockserver", obj);
		System.out.println("server ready...");
	}
}
