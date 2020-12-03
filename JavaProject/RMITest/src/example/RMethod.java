package example;
import java.rmi.*;

public interface RMethod extends Remote {
     String sayHello(String name) throws RemoteException;
}