import java.net.*;

public class ExampleReceiver {

	public static void main(String [] arg){
		if(arg.length != 1){
		}
		else{

			int port = Integer.parseInt(arg[0]);
			int MAX_LEN = 20;
			int msgCount = 0;
			try{

			DatagramSocket DS = new DatagramSocket(port);
			byte [] B = new byte[MAX_LEN];

			DatagramPacket DP = new DatagramPacket(B,B.length);
			String  M = new String();
                
            DS.receive(DP);
		    M = new String(B);
		    System.out.println("Sender: "+M);

		    InetAddress A = InetAddress.getByName("localhost");
			// port = Integer.parseInt(arg[1]);
			String message = "Did you just said "+ M + " ?";

            
			DS = new DatagramSocket();
			B = message.getBytes();

			DP = new DatagramPacket(B,B.length,A,++port);
			

			DS.send(DP);
			
			Thread.sleep(10000);
			DS.close();
	
			}
			catch (Exception e) {
				e.printStackTrace();
			}


		}
	}
}