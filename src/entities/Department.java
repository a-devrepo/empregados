package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;
	private Address address;
	private List<Employee> employes = new ArrayList<Employee>();

	public Department() {
	}

	public Department(String name, Integer payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public void addEmployee(Employee employee) {
		employes.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employes.add(employee);
	}

	public Double payRoll() {
		double sum = 0.0;
		for (Employee e : employes) {
			sum += e.getSalary();
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployes() {
		return employes;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", payDay=" + payDay + "]";
	}
}
