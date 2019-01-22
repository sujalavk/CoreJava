
class MemberOuter {

	int data = 30;

	class Inner {

		void msg() {
			System.out.println("data is " + data);
		}
	}

}

public class TestMemberOuter {

	public static void main(String args[]) {
		MemberOuter obj = new MemberOuter(); // create outerclass object
		MemberOuter.Inner in = obj.new Inner(); // create inner class object
		in.msg();
	}
}
