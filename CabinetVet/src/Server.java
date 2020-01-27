
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

	public Server() {}


	public static void main(String args[]) {

		try {
			System.setProperty("java.security.policy" , "/home/e20190006703/workspace/CabinetVet/src/policy");
			System.setSecurityManager(new SecurityManager());
			
			AnimalImpl Nasser = new AnimalImpl("Yannis","Nasser", new Race("Humain"), new DossierSuivi("L animal va bien"));
			
			// Registry registry = LocateRegistry.createRegistry(1099);
			Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.rebind("Hello", Nasser);
				System.err.println("Server ready");
			}
			
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}	
	}
}