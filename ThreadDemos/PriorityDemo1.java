class HelloThread extends Thread {
	public void run()
	{
		
	
		try {
			Thread.sleep(5000);
			for(int i=1;i<=10;i++)
				  System.out.println(Thread.currentThread().getName()+"Hello");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("HelloThread"+Thread.currentThread().getPriority());
	}
}

class HiThread extends Thread{
	public void run()
	{
		
		try {
			Thread.sleep(5000);
			for(int i=1;i<=10;i++)
				  System.out.println(Thread.currentThread().getName() +"Hi");
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("HiThread"+Thread.currentThread().getPriority());
	}
}

public class PriorityDemo1 {

	public static void main(String[] args) {
	   HelloThread th1=new HelloThread();
		th1.setPriority(Thread.MAX_PRIORITY);
		HiThread th2=new HiThread();
		th2.setPriority(Thread.NORM_PRIORITY+2);
		th1.start();
		
		
		th2.start();

	}

}
