package Arraylist;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private int exp;
	private String designation;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setExp(int exp) {
		this.exp=exp;
	}
	public int getExp() {
		return exp;
	}public void setDesig(String designation) {
		this.designation=designation;
	}
	public String getDesig() {
		return designation;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public Employee(String name,int age,String gender,int salary,int exp,String designation) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.exp=exp;
		this.designation=designation;
	}
	
	public String toString() {
		return "Name: "+name+", Age: "+age+", Gender: "+gender+", Salary: "+salary+", Experice: "+exp+", Designation: "+designation;
	}

}
