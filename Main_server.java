
package myproject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main_server {
	
	private static int PORT = 9002;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Simple Socket server....");
		System.out.println(".........................");
		
		ServerSocket server_socket = new ServerSocket(PORT);
		int current_clients = 0;

		try {
		while(true) {
			Socket client = server_socket.accept();
			System.out.println("Client "+ current_clients +" is connected...");
			
			Server_Thread ct = new Server_Thread(client, current_clients);
			ct.start();
			
			current_clients++;
		}
		}finally {
			server_socket.close();
		}
			
			
		
	}
}