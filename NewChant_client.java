package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class NewChant_client {
	
	private static int PORT = 9002;
	
	public static void main(String[] args) throws IOException {
	 
		System.out.println("Simple Client....");
		System.out.println(".................");
		
		//127.0.0.1
		InetAddress IpAddress = InetAddress.getLocalHost();
		Socket socket = new Socket (IpAddress,PORT);
		 
		System.out.println("Server is connected...."); // first task done socket is connected
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream()); // read from the sever
		BufferedReader in = new BufferedReader(isr); // buffer it
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		Scanner scan = new Scanner (System.in);
		
		try {
			while(true) {
				String input = in.readLine(); // data read from server side
				System.out.println("Server says:" + input);// display masge from server
				
				System.out.println("Client type something:");
				String output = scan.nextLine(); //type something to server
				out.println(output); // send to server
				
			}}
			
		finally {
			socket.close();
			out.close();
			in.close();
		}
	
	}
}
