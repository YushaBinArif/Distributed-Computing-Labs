import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Payroll extends Remote
{
	public EmployeeInfo[] earnings (int id, double hours) throws RemoteException;
}
