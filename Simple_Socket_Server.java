package myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Simple_Socket_Server {
	private static int PORT= 9999;
			
	public static void main(String[] args) throws IOException{ // - if an I/O error occurs when waiting for a connection.
		
		System.out.print("Simple Socket server");
		System.out.print("------");
		
		ServerSocket server_socket = new ServerSocket(PORT); //ServerSocket is a java.net class that provides a system-independent implementation of the server side of a client/server socket connection.
		try {
		
		while (true) {
			Socket socket = server_socket.accept();
			System.out.println("Client is connected...");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);//PrintWriter converts the primitive data ( int , float , char , etc.) into the text format.
			out.println("Hello Client"); //this is go as the reply to client console
			
			socket.close();
			
		}}
		finally {
			server_socket.close();
		}
		
		
	}

}
