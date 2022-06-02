package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Server_Thread extends Thread {
	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	private Scanner scan ;
	private int client_id;
	
	public Server_Thread(Socket client, int cid) throws IOException{
		this.client = client;
		this.client_id = cid;
		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream(),true);
		scan = new Scanner(System.in);
	}


	
    @overide
    public void run() {
    	try {
    		while(true) {
    			System.out.println("Server type something:");
    			String input =scan.nextLine();
    			out.println(input);
    			
    			String output = in.readLine();
    			System.out.println("Client says:" + output);	
    			//out.println(output);	
    		}
    	
    	} catch(IOException e) {
    		e.printStackTrace();
    		
    	} finally {
    		try {
    			client.close();
    			out.close();
    			in.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }

}
