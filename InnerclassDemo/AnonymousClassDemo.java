/*abstract class Vehicle{
	abstract void start();
	
}
*/
interface Vehicle {
	void start();

}

public class AnonymousClassDemo {
	public static void main(String[] args) {

		Vehicle v = new Vehicle() {
			public void start() {
				System.out.println("Car started");

			}

		};
		v.start();
	}

}
