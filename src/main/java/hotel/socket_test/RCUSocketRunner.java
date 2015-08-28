package hotel.socket_test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class RCUSocketRunner extends Thread{
	
	private String ip;
	private int port;
	private Socket client;
	
	public RCUSocketRunner(String ip,int port){
		
		this.ip=ip;
		this.port=port;
	}
	
	public void run(){
		try {
			client=new Socket(ip,port);

			String s="{Type:'Ctl',sid:'123456',USID:'56789'}{Type:'action',v";
			
			byte[] bs=s.getBytes();
			
			DataOutputStream writer = new DataOutputStream(client.getOutputStream());  
		
			writer.write(bs);

		    writer.flush();//写完后要记得flush  
		    writer.close();  
		    client.close();  
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
