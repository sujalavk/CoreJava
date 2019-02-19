
public interface UserBusiness {
	boolean registerUser(Users u);
	boolean updateUser();
	Users[] SearchBySkills();
	
	boolean AuthenticateUser();
	void ListEmployees(Users u);

}
