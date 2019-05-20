import java.rmi.*;

public class TestClient{
	public static void main(String [] a){
		Test mTest;
    String url = "rmi://localhost/TestServer";
	try{
        
        mTest = (Test)Naming.lookup(url);
        System.out.println(mTest.add(5,5));
	}
	catch(Exception e){
	    System.out.println("Hello Client" +e);
	}
	}
}