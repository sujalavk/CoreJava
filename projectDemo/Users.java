//pojo class

public class Users {
	private int empId;
	private String name;
	private Skills s;
	static int id=100;
	public Users() {
		this.empId=id++;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
