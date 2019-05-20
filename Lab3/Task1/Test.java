import java.rmi.*;

public interface Test extends Remote {
	
	public int add(int x, int y) throws RemoteException ;
}