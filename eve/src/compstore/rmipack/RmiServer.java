package compstore.rmipack;

import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Properties;

import compstore.baseapp.MyApp;

public class RmiServer extends UnicastRemoteObject implements BusinessInterface{
public RmiServer() throws Exception{
		
	}
	
	@Override
	public Object getZackriahStoreObject() throws RemoteException {
		int count=0;
			try {
				Properties prop=new Properties();
				prop.load(new FileInputStream("service-config.properties"));
				Enumeration counten=prop.elements();
				int noofservices=0;
				while(counten.hasMoreElements()) {
					noofservices=noofservices+1;
					System.out.println(counten.nextElement());
				}
				System.out.println("No of services...:"+noofservices);
				Class c[]=new Class[noofservices];
				Object o[]=new Object[noofservices];
				Enumeration en=prop.elements();
				while(en.hasMoreElements()) {
					String serviceConfigFile=(String)en.nextElement();
					System.out.println("service files...:"+serviceConfigFile);
					Properties servicesProp=new Properties();
					servicesProp.load(new FileInputStream(serviceConfigFile));
					String interfaceimpl=servicesProp.getProperty("interfaceimpl");
					String interfacename=servicesProp.getProperty("interfacename");
					o[count]=Class.forName(interfaceimpl).getConstructor(null).newInstance(null);
					c[count]=Class.forName(interfacename);
					//list.add(Class.forName(interfacename));
					//list.add(interfacename);
					++count;
					}
				
				Object obj=Proxy.newProxyInstance(new MyApp().getClass().getClassLoader(), 
						c,new MyInvocationHandler(o));
				//System.out.println("The object...:"+obj);
				return obj;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
	
	
	public static void main(String[] args)throws Exception {
		RmiServer server=new RmiServer();
		LocateRegistry.createRegistry(2000);
		Naming.bind("rmi://localhost:2000/zackriahshop", server);
		
		System.out.println("Server ready...");
	}
}
class MyInvocationHandler implements InvocationHandler,Serializable{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret=null;
		for(Object o:obj) {
			if(o!=null) {
			Method m[]=o.getClass().getDeclaredMethods();
			for(Method mm:m) {
				mm.setAccessible(true);
			}
			try {
				System.out.println("method invoked...");
				ret=method.invoke(o, args);
			}catch(Exception e) {
				//e.printStackTrace();
			}
			}
		}
		return ret;
	}
}


