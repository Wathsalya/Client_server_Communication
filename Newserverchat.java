package myproject;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Newserverchat {

	private static int PORT = 9001; // port number range from 0 to 65535
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Simple Socket Server....");
		System.out.println("........................");	
		ServerSocket server_socket = new ServerSocket(PORT);	
		Scanner scan = new Scanner(System.in); //create scan for input (type something)
		
		try {
		while(true) {
			Socket socket = server_socket.accept();
			System.out.println("Client is connected....");// first task done socket is connected
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			InputStreamReader isr= new InputStreamReader(socket.getInputStream())
			BufferedReader in = new BufferedReader(isr);
			
			try {
			while(true) {
			
			System.out.println("Server type something:");
			String input =scan.nextLine();
			out.println(input);
			
			String output = in.readLine();
			System.out.println("Client says:" + output);	
			//out.println(output);	
		}}
			finally {
				socket.close();
				out.close();
				in.close();
			}	
		}}
		finally {
			server_socket.close();	
		}
		
}}
