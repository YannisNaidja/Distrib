
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Animal extends Remote{
	String getName() throws RemoteException;
	String getMasterName() throws RemoteException;
	void printID() throws RemoteException;
	void setDesc(String s) throws RemoteException;
	String getRace() throws RemoteException;
}


