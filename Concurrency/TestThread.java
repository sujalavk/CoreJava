//The following TestThread program shows a unsafe implementation of counter
//in thread based environment.
//produce the following result depending upon computer's speed and thread interleaving.
package concurrency;

public class TestThread {

	   static class Counter {
	      private int c = 0;

	      public void increment() {
	         c++;
	      }

	      public int value() {
	         return c;
	      }
	   }
	   
	   public static void main(final String[] arguments) throws InterruptedException {
	      final Counter counter = new Counter();
	      
	      //1000 threads
	      for(int i = 0; i < 1000 ; i++) {
	         
	         new Thread(new Runnable() {
	            
	            public void run() {
	               counter.increment();
	            }
	         }).start(); 
	      }  
	      Thread.sleep(6000);
	      System.out.println("Final number (should be 1000): " + counter.value());
	   }  
	}