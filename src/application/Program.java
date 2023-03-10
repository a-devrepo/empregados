package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Nome do departamento: ");
		String departmentName = sc.nextLine();

		System.out.printf("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();

		Department department = new Department(departmentName, payDay);

		System.out.printf("Email: ");
		String email = sc.nextLine();

		System.out.printf("Telefone: ");
		String phoneNumber = sc.nextLine();

		Address address = new Address(email, phoneNumber);
		department.setAddress(address);

		System.out.printf("Quantos funcionários tem o departamento? ");
		int employes = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < employes; i++) {
			System.out.printf("Dados do funcionário %d", i + 1);
			System.out.printf("%nNome: ");
			String name = sc.nextLine();

			System.out.printf("Salário: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			Employee employee = new Employee(name, salary);
			department.addEmployee(employee);
		}
		showDepartment(department);
	}

	public static void showDepartment(Department department) {
		System.out.printf("%nFOLHA DE PAGAMENTO: ");
		System.out.printf("%n%s = %.2f", department.getName(), department.payRoll());
		System.out.printf("%nPagamento realizado no dia %d", department.getPayDay());
		System.out.printf("%nFuncionários: ");
		for (Employee e : department.getEmployes()) {
			System.out.printf("%n%s", e.getName());
		}
		System.out.printf("%nPara dúvidas favor entrar em contato: %s", department.getAddress().getEmail());
	}
}
