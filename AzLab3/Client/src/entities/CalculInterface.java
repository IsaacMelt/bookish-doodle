package entities;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculInterface extends Remote {
    public int add(int a, int b, int c) throws RemoteException;

}
