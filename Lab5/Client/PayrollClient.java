import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class PayrollClient
{
	static String str;
	static String str1;
	
	public static void main(String[] args) 
	{
		try
		{
			Payroll  p = (Payroll)Naming.lookup("rmi://localhost:1099/money");
			System.out.println("I am connected to registry!");
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Enter the id and the hours (or enter -1 for id to exit");
			while(scan.hasNext())
			{
				str = scan.next();
				str1 = scan.next();
				if(str.equals("-1"))
				{
					System.exit(0);
				}
				int id  = Integer.parseInt(str);
				double d = Double.parseDouble(str1);
				EmployeeInfo v[] = p.earnings(id,d);
				for(int i=0;i<=v.length-1;i++)
				{
					System.out.println("Rertived from the server were:"+" "+v[i]);
				}
			} 
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
}
