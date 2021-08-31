package Day1;

public class Emp {
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	Emp()
	{
		
	}
private int id;
private String name;
private int salary;
private Department dept;
public Emp(int id, String name, int salary, Department dept) {
	//super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}


}
