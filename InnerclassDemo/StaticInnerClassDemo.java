
class Outer {
	static int data = 30;

	static class Inner {

		void msg() {
			System.out.println("data is " + data);
		}
	}
}

public class StaticInnerClassDemo {

	public static void main(String args[]) {

		Outer.Inner in = new Outer.Inner(); // create static inner class object
		in.msg();
	}
}
