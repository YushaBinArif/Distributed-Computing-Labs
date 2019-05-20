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
				double m = p.earnings(id,d);
				System.out.println("Your earnings were:"+" "+m);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
}
