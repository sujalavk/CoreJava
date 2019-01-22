
public class LocalInnerClass {

	  int data = 30;// instance variable

	void display() {

		class Local {
       final int localX=10;
			void msg() {
				System.out.println(data);
				System.out.println(localX);
			}
		}
		Local l = new Local();//create local class object
		l.msg();//calling localclass method
	}//display end

	public static void main(String args[]) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
		
		
	}
}
