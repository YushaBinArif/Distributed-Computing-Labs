import java.rmi.*;
import java.rmi.server.*;

public class PayrollImpl extends UnicastRemoteObject implements Payroll
{
	EmployeeInfo EmployeeInfoArray[] = new EmployeeInfo[10];

	public PayrollImpl() throws RemoteException
	{
		super();
	}
	public EmployeeInfo[] earnings (int id, double hours)
	{
		double pay;
		if(id==1)
		{
			pay =hours*100;
			for(int r =0;r<=EmployeeInfoArray.length-1;r++)
			{
				EmployeeInfoArray[r] = new EmployeeInfo ("clerk"+r, "Abdullah"+r, pay,"Clerk");
			}
		}
		else if(id==2)
		{
			pay =hours*50;
			for(int r =0;r<=EmployeeInfoArray.length-1;r++)
			{
				EmployeeInfoArray[r] = new EmployeeInfo ("Peon"+r, "Aliyan"+r, pay,"Peon");
			}
		}
		
		return EmployeeInfoArray;
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
