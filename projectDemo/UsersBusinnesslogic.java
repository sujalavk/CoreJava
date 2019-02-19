
public class UsersBusinnesslogic implements UserBusiness {

	@Override
	public boolean registerUser(Users u) {
	if(	validateUser(u))
		System.out.println("user registred to successfully");
	else
		System.out.println("user registred to successfully");
		return false;
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users[] SearchBySkills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateUser(Users u) {
		
		return true;
	}

	@Override
	public boolean AuthenticateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ListEmployees(Users u) {
	System.out.println("Emp Id:"+u.getEmpId());
	System.out.println("Emp Name:"+u.getName());
	}


}
