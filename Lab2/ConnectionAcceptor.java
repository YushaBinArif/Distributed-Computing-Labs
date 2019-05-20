import java.net.*;
import java.io.*;

public class ConnectionAcceptor {

	public static void main(String[] e){
		if(e.length == 2){
			try{
				int portNo = Integer.parseInt(e[0]);
			    String message = e[1];
			    ServerSocket connectionSocket = new ServerSocket(portNo);
			    System.out.println("Now Ready To Accept A Connection");
			    Socket dataSocket = connectionSocket.accept();
			    System.out.println("Connection Accepted");
			    OutputStream outStream = dataSocket.getOutputStream();
			    PrintWriter socketOutput = new PrintWriter(new OutputStreamWriter(outStream));
			    Thread.sleep(5000);
			    socketOutput.println(message);
			    socketOutput.flush();
			    System.out.println("Message Sent !!!!");
			    dataSocket.close();
			    System.out.println("dataSocket Closed !!!!");
			    Thread.sleep(1000);
			    connectionSocket.close();
			    System.out.println("connectionSocket closed!!!");
			       			    
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}

	}
}