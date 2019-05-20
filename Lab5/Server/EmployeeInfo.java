import java.rmi.*;
import java.io.Serializable;
public class EmployeeInfo implements Serializable
{
	private String firstName;
	private String lastName;
	private double salary;
	String descr;

	public EmployeeInfo (String fn,String ln ,double sal, String d)
	{
		firstName =fn;
		lastName = ln;
		salary =sal;
		descr = d;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getDescr()
	{
		return descr;
	}
	public String toString()
	{
		return "the information is : "+ getFirstName ()+" "+getLastName() +"  "+getSalary()+"  "+getDescr();
	}

}
