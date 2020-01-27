import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DossierSuiviInt extends Remote {
	public String getDesc() throws RemoteException;
	public void setDesc(String s)throws RemoteException;

}
