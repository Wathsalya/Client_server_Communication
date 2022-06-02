package myproject;

import java.math.BigInteger;
import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // System.out.println("Hello World");
       // System.out.print("Hello World");
       // System.out.print("Hello World");
        
        
        //Scanner input = new Scanner(System.in); //objects
        //System.out.print("Enter name :");
        //String in = input.nextLine();
        
        //System.out.println("Hello " + in);
		//isPrime(7);
		BigInteger x = new BigInteger("23");
		BigInteger y = new BigInteger("27");
	    boolean z = iscoPrime(x,y);
		
	}
	static void isPrime(int x) {
		int divisor= 2;
		boolean status =true;
		
		
		while(divisor < x) {
			if(x % divisor == 0) {
			status = false;
			break;//stops the while becase already not a prime
			}
			divisor= divisor + 1; //
		}
	   if(status == true) 
		   System.out.println(x + ": is a prime number");
	   else
		   System.out.println(x + ": is not a prime number");
	   
	}
	static boolean iscoPrime(BigInteger x ,BigInteger y ) {  //big integer, gcd(x,y)==1
		
		BigInteger z = x.gcd(y);
		if(z.intValue() == 1)
			//System.out.println("Hello World");
			return true;
		else
			return false;
		
	}
	
}
