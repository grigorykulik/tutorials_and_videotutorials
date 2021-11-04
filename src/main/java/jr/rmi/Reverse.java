package jr.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Reverse extends Remote {
    public String reverse(String s) throws RemoteException;
}
