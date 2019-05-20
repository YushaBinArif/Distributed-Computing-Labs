import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
public class TestImpl extends UnicastRemoteObject implements Test {
	public TestImpl() throws RemoteException {

	}

	public int [] sortIt(int [] a) throws RemoteException{
        
        Arrays.sort(a);
        return a;
	}
}