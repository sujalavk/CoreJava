class ChildThread extends Thread {
	public void run()
	{
		
	
		try {
			Thread.sleep(5000);
			for(int i=1;i<=10;i++)
				  System.out.println(Thread.currentThread().getName()+":"+i*2);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		ChildThread ch=new ChildThread();
		ch.start();
		try {
			ch.join();//main thread will wait until child will complete
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		if(Thread.currentThread().isAlive())
			System.out.println("Main is running");
		else
			System.out.println("Main is not running ");
		System.out.println("main ends");

	}

}
