package MapEg1;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable,Cloneable
 {
 
	int id2;
	
	
	public Employee(int id2, String name2, double salary2, String email2) {
		this.id2=id2;
		this.name2=name2;
		this.salary2=salary2;
		this.email2=email2;
		
	}
	
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public double getSalary2() {
		return salary2;
	}
	public void setSalary2(double salary2) {
		this.salary2 = salary2;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	String name2;
	double salary2;
	String email2;


	@Override
	public int compareTo(Employee o) {
		if (this.id2 > o.id2) {
			return 1;
		} else if (this.id2 < o.id2) {
			return -1;

		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [id2=" + id2 + ", name2=" + name2 + ", salary2=" + salary2 + ", email2=" + email2 + "]";
	}
	
}
