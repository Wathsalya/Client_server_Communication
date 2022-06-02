
package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Chat_client {
	
	private static int PORT = 9002;
	public static void main(String[] args) throws IOException {
		
		System.out.println("Simple client....");
		System.out.println(".........................");
		//127.0.0.1
		InetAddress ipAddress = InetAddress.getLocalHost(); //IP address of the external server
		
		Socket socket = new Socket(ipAddress, PORT);
		
		System.out.println("Server is connected...");
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader in = new BufferedReader(isr);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
			  String input = in.readLine();
			  System.out.println("Server says : "+ input);
			
			  System.out.print("Client : ");
			  String output = scan.nextLine();
			  out.println(output);}
			
		}finally {
			socket.close();
			out.close();
			in.close();	
		}		
	}
}
