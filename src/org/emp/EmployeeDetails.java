package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner emp = new Scanner(System.in);
		System.out.println("Emp Id is");
		int empId = emp.nextInt();
		System.out.println("Emp Name is");
		String empName = emp.next();
		System.out.println("Emp Email Id is");
		String empEmail = emp.next();
		System.out.println("Employee Phone No");
		long empPhn = emp.nextLong();
		System.out.println("Employee Salary is");
		long empSalary = emp.nextLong();
		System.out.println("Employee Gender is");
		String empGender = emp.next();
		System.out.println("Employee City Is");
		String empCity = emp.next();

		System.out.println("empId");
		System.out.println("empName");
		System.out.println("empEmail");
		System.out.println("empPhn");
		System.out.println("empSalary");
		System.out.println("empGender");
		System.out.println("empCity");

	}

}
