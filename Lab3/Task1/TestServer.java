import java.rmi.*;

class TestServer {
	public static void main(String [] a){

	    try{
	        Naming.rebind("rmi://localhost/TestServer", new TestImpl());
	        System.out.println("Hello server is ready");
	    }
	    catch(Exception e){
	        System.out.println("Hello server failed"+ e);
	    }
	}
}