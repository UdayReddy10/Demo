package Deloitte;

public class TTThread implements Runnable{

	@Override
	public void run() {
try {
	Thread.sleep(100000);
} catch (InterruptedException e) {
System.out.println("Exception Handler");
}		
System.out.println("Run method ends here");
	}
public static void main(String[] args) {
	Thread t=new Thread(new TTThread());
	t.start();
	t.interrupt();
	System.out.println("Main method ends here");
}
}
