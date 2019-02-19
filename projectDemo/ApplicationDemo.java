import java.util.Scanner;

public class ApplicationDemo {
	public static void main(String[] args) {
		
	
	Users u =new Users();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Name");
	String name=sc.next();
	u.setName(name);
	
	
	
	UsersBusinnesslogic  ub=new UsersBusinnesslogic();
	ub.validate(name);
	ub.registerUser(u);
	ub.ListEmployees(u);
	}while(ch='y');
	}
	

	

}
