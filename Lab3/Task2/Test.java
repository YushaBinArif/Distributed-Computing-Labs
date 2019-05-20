import java.rmi.*;

public interface Test extends Remote {
	
	public int [] sortIt(int [] list) throws RemoteException ;
}