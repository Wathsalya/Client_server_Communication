package myproject;

import java.math.BigInteger;
import java.util.Scanner;

public class Newbasics {
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
	    
	    int tot = totient(x);
	    System.out.println("Toteint value is  "+ x.intValue() + ":" + tot);
	    
	    euclidian();
	    
		
	}
	
	static void euclidian() {
		BigInteger a,b ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a :");
		String str_a = input.nextLine();
		a= new BigInteger(str_a);
		
		System.out.print("Enter b :");
		String str_b = input.nextLine();
		b= new BigInteger(str_b);
		
		while(b.compareTo(BigInteger.ZERO)  != 0) {
			System.out.println("gcd(a = "+ a + " b =" + b +")");
			
			
			BigInteger z = a;
			a = b;
		    b = z.mod(b);		//does not have the same value of a	
			
		}
		System.out.println("gcd(a = "+ a + " b =" + b +")");
		System.out.println("Answer:"+ a);
		
		
	}
	
	 static int totient(BigInteger x) {
		 int total =0;
		 
		 for(int i= 1; i < x.intValue(); i++){
			 if(iscoPrime(x, BigInteger.valueOf(i)) == true) {
				 System.out.print(i);
				 total++;
		      }
	      }
		  return total;
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
