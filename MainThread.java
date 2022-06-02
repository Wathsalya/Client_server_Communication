package myproject;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadhandler t1 = new Threadhandler(1);
		Threadhandler t2 = new Threadhandler(2);
		Threadhandler t3 = new Threadhandler(3);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
