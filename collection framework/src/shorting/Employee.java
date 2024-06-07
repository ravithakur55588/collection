package shorting;

public class Employee {
	private int eid;
	private String ename;
	private int age;
	private long salary;
	public Employee(int eid, String ename, int age, long salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
