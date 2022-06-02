
package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_server {
	private static int PORT= 9002;

	public static void main(String[] args) throws IOException{
		
		System.out.print("Simple Socket server");
		System.out.print("------");
		
		ServerSocket server_socket = new ServerSocket(PORT); //create a server socket
		Scanner scan = new Scanner(System.in); //The Scanner class is used to get user input.
		try { 
		
		while (true) {
			Socket socket = server_socket.accept();
			System.out.println("Client is connected...");
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);//send to client 
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//read the massage from client
			
		    try {
			while (true) {
				System.out.print("Server:");
				String input = scan.nextLine();
				//if(input.equals(scan))
				out.println("Hello Client"); // send to client				
				String output = in.readLine();
				System.out.print("Client says:"+ output);
			  }		
			} finally {

			socket.close();
			out.close();
			in.close();
		    }
		    }
		
		}finally {
			server_socket.close();		
		}
	}

}
