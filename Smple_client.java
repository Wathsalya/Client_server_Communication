package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Smple_client {
	public static int PORT = 9999;// initialize the port 9999
	
    public static void main(String[] args) throws IOException {
		
		System.out.println("Simple Client");
		System.out.println("------");
		
		InetAddress ipAddress = InetAddress.getLocalHost();//ip address of the externel server overhere InetAddress class provides methods to get the IP address of any hostname. 
		
        Socket socket = new Socket(ipAddress,PORT); // one endpoint of a two-way communication link between two programs running on the network.
        System.out.println("Server is connected");
        
        InputStreamReader isr = new InputStreamReader(socket.getInputStream()); //t reads bytes and decodes them into characters using a specified charset. It is recommended to wrap an InputStreamReader within a BufferedReader for optimal efficiency.
        BufferedReader in = new BufferedReader(isr); //is a Java class to reads the text from an Input stream (like a file) by buffering characters that seamlessly reads characters, arrays or lines. 
        
        String input = in.readLine();
        System.out.println("Server says"+ input);
        socket.close();
        in.close();
        		
      }
    }
