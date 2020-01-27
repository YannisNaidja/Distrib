import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuivi extends UnicastRemoteObject implements DossierSuiviInt {
	
	String Description;
	
	public DossierSuivi(String d) throws RemoteException {
		this.Description = d;
	}
	 public String getDesc() throws RemoteException {
		return this.Description;
	}
	@Override
	public void setDesc(String s) throws RemoteException {
		this.Description = s;
		
	}
	
	
}
