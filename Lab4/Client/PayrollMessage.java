import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PayrollMessage extends Remote
{
	public void message (String str) throws RemoteException;
}
