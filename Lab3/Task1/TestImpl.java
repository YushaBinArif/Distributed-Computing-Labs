import java.rmi.*;
import java.rmi.server.*;
public class TestImpl extends UnicastRemoteObject implements Test {
	public TestImpl() throws RemoteException {

	}

	public int add(int x, int y) throws RemoteException{
        return (x+y);
	}
}