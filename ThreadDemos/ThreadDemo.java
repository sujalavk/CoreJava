class MyThread1 extends Thread {
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

class MyThread2 extends Thread{
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

public class ThreadDemo {

	public static void main(String[] args) {
	
		MyThread1 th1=new MyThread1();
		System.out.println("Name:"+Thread.currentThread().getName()+" state"+Thread.currentThread().getState());
		th1.start();
		
		MyThread2 th2=new MyThread2();
		th2.start();
		th2.stop();
		System.out.println("Main ends");
		System.out.println("Thread-0:"+th1.getState());
		
		System.out.println("Thread-1:"+th2.getState());
	}
	
}

