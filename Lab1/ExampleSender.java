	import java.net.*;

public class ExampleSender {

	public static void main(String [] arg){
		int MAX_LEN = 20;
		if(arg.length == 3){
			try{
			InetAddress A = InetAddress.getByName(arg[0]);
			int port = Integer.parseInt(arg[1]);
			String message = arg[2];

            
			DatagramSocket DS = new DatagramSocket();
			byte [] B = message.getBytes();

			DatagramPacket DP = new DatagramPacket(B,B.length,A,port);
			

			DS.send(DP);

			DS = new DatagramSocket(++port);
			B = new byte[MAX_LEN];

			DP = new DatagramPacket(B,B.length);
			String  M = new String();
                
            DS.receive(DP);
		    M = new String(B);
		
		    System.out.println("Sender: "+M);
            Thread.sleep(10000);
			DS.close();

			}
			catch (Exception e) {
				
			}


		}
	}
}