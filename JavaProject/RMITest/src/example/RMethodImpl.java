package example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMethodImpl extends UnicastRemoteObject implements RMethod {
    public RMethodImpl() throws RemoteException {
        super();
    }

    public synchronized String sayHello(String name) throws RemoteException {
        System.out.println("Client-" + name + ": invoking \"sayHello\"");
        return "Hello " + name + "\n this is a message from remote method.";
    }
}
