package example;
import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try{
            RMethod rm = (RMethod) Naming.lookup("rmi://localhost:5099/hello");
            System.out.println(rm.sayHello("John"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
