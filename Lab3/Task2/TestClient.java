import java.rmi.*;

public class TestClient{
	public static void main(String [] a){
		Test mTest;
    String url = "rmi://localhost/TestServer";
	try{
        int [] arr = {1,5,2,5,3,4,6};
        mTest = (Test)Naming.lookup(url);
        int [] temp = mTest.sortIt(arr);
        for (int i =0 ; i< temp.length ; i ++ ) {
            System.out.println(i+"");	
        }
	}
	catch(Exception e){
	    System.out.println("Hello Client" +e);
	}
	}
}