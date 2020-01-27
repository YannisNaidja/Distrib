

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject  implements Animal {
	DossierSuivi dossier ;
	String mastername;
	String name;
	Race race;
	

	public String getRace() throws RemoteException {
		return this.race.getNom();
	}
	
	public AnimalImpl(String mastername , String name , Race race , DossierSuivi d) throws RemoteException{
		this.dossier = d;
		this.mastername = mastername;
		this.name = name;
		this.race = race;
	}

	public void setDesc(String s) {
		this.dossier.setDesc(s);
	}

	public String getName() throws RemoteException {
		return this.name;
	}

	@Override
	public String getMasterName() throws RemoteException {
		
		return this.mastername;
	}

	@Override
	public void printID() throws RemoteException {
		System.out.println("l animal "+this.name+" de race "+this.getRace()+" est possede par "+this.mastername+ " Description du dossier: "+ this.dossier.getDesc() );
	
	}


	
	}

