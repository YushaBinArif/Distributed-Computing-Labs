import java.rmi.*;
import java.rmi.server.*;

public class PayrollImpl extends UnicastRemoteObject implements Payroll
{
	public PayrollImpl() throws RemoteException
	{
		super();
	}
	public double earnings (int id, double hours)
	{
		double pay;
		if(id<=5)
		{
			pay =hours*100;
		}
		else if(id>5 && id<=10)
		{
			pay =hours*50;
		}
		else
			pay =0.0;
		try
		{
			PayrollMessage pm = (PayrollMessage) Naming.lookup("rmi://localhost:1099/message");
			System.out.println("I am connected to registry");
			pm.message("I am ready to sent the payroll amount");

		}
		catch (Exception e)
		{

		}
		return pay;
	}

	public static void main(String[] args) 
	{
		String ro = "//localhost/money";
		try
		{
			PayrollImpl  p = new PayrollImpl();
			Naming.rebind(ro, p);
		}
		catch (Exception e)
		{
			System.out.println("Error while binding object");
			System.out.println(e.toString());
		}
		System.out.println("Hello World The rmi server is running!");
	}
}
