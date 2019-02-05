

class CThread implements Runnable{
	public void run()
	{
		
		try {
			Thread.sleep(5000);
			for(int i=1;i<=10;i++)
				  System.out.println(Thread.currentThread().getName() +":"+i*5);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		CThread ch=new CThread();
		Thread th=new Thread(ch,"ChildThread");
		th.start();
		
	}

}
