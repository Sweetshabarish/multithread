package Multithred;

public class runmethods extends Thread {
	public void run() {
		for(int i=0;i<6;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
			
	}
	
	public static void main(String[] args) {
		runmethods s=new runmethods();
		runmethods s2=new runmethods();
//		s.run();
//		s2.run();
		
            Thread t = Thread.currentThread();
            System.out.println(t.getPriority());        
        
		
	}

}
