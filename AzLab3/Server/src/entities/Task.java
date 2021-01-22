package entities;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Task extends UnicastRemoteObject implements CalculInterface {
    public Task() throws RemoteException{
        int a,b,с;
    }

    @Override
    public int add(int a, int b, int c) throws RemoteException {
        return (a+b+c)/3;
    }
}
