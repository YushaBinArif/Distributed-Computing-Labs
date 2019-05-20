import java.net.*;

public class BiDirectionalReceiver {

	public static void main(String [] arg){
		if(arg.length != 1){
		}
		else{

			int port = Integer.parseInt(arg[0]);
			int MAX_LEN = 10;
			int msgCount = 0;
			try{

			DatagramSocket DS = new DatagramSocket(port);
			byte [] B = new byte[MAX_LEN];

			DatagramPacket DP = new DatagramPacket(B,B.length);
			    
		    String M = new String();
		    DS.receive(DP);
		    M = new String(B);
			
          	System.out.println(M);
			
			Thread.sleep(10000);
			DS.close();
	
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}


		}
	}
}