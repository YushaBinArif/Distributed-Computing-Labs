import java.net.*;
import java.io.*;
//this application requests a connection and sends a message
// using the stream mode socket.
public class ConnectionRequestor {
public static void main(String[] args){
if(args.length!=2){
System.out.println("This program requires two command line arguments");
// the arguments are
//host name of connection acceptor and port number of connection acceptor
}
else{
try{
InetAddress acceptorHost=InetAddress.getByName(args[0]);
int acceptorPort=Integer.parseInt(args[1]);
Socket mySocket=new Socket(acceptorHost,acceptorPort);
System.out.println("Connection request granted.");
InputStream inStream=mySocket.getInputStream();
//create buffered reader object for character mode output
BufferedReader socketInput=new BufferedReader(new InputStreamReader(inStream));
System.out.println("Waiting to read.");
String message=socketInput.readLine();
System.out.println("Message received :"+"\t"+message);
mySocket.close();
System.out.println("data socket closed.");
Thread.sleep(10000);
}
catch(Exception ex){
ex.printStackTrace();
}
}
}
}

