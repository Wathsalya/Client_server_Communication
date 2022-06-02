package myproject;



public class Threadhandler extends Thread{
	
	private int thread_id;
	
	public Threadhandler(int t) {
		// TODO Auto-generated constructor stub
		this.thread_id = t;
	}
	
	
	@overide
	public void run() { //whatever run it parallel we write here
	 for(int i=0; i<=5; i++){
		System.out.println(thread_id + " ->"+ i);
		
		if(thread_id == 2) {
			throw new RuntimeException();
			
		}
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		}
		
	}

}
