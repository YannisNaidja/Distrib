

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	private Client() {}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			Animal stub = (Animal) registry.lookup("Hello");
			String response = stub.getName();
			System.out.println("response: " + response);
			stub.printID();
			stub.setDesc("Mis a jour");
			stub.printID();
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
