import java.net.*;
import java.io.*;
public class BroadcastingClient {
    private static DatagramSocket socket = null;
 
    public static void main(String[] args) throws IOException {
        String message = args[0];
        for(int i= 0; i<args.length-1; i++){
            broadcast(message, InetAddress.getByName("255.255.255.255"), Integer.parseInt(args[i+1]));   
        }
    }
 
    public static void broadcast(
      String broadcastMessage, InetAddress address, int port) throws IOException {
        socket = new DatagramSocket();
        socket.setBroadcast(true);
 
        byte[] buffer = broadcastMessage.getBytes();
        DatagramPacket packet 
          = new DatagramPacket(buffer, buffer.length, address, port);
        socket.send(packet);
        socket.close();
    }
}