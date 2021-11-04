package jr.rmi;

import java.rmi.RemoteException;

public class ReverseImpl implements Reverse {
    @Override
    public String reverse(String s) throws RemoteException {
        return new StringBuffer(s).reverse().toString();
    }
}
