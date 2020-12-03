package example;
import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args) throws RemoteException{

        Registry reg = LocateRegistry.createRegistry(5099);
        try {
            RMethod rm = new RMethodImpl();
            reg.rebind("hello", rm);
            System.out.println("Server is running...");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Server startup failed!");
            e.printStackTrace();
        }
    }
}
