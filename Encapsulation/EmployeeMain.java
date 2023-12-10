//  aggregation relation example
package com.company.encapsulation;
import java.util.Scanner;

class Company{
	Employee e;
	
    public void addEmployee(Employee e) {
        if (this.e == null) {
            this.e = e;
            System.out.println("Employee is added successfully");

        } else {
            System.out.println("Employee is already there !!");
        }
    }

    public void removeEmployee() {

        if (this.e != null) {
            this.e = null;
            System.out.println("\nEmployee fired from the company");
        } else {
            System.out.println("Employee is not there !!");
        }
    }
    
    public void displayDetails() {
    	if(this.e == null) {
            System.out.println("Employee is not added, add employee before displaying details !!");
    	}
    	else {
        System.out.println("Employee name is : " + e.getEmpName());
        System.out.println("Employee salary is : " + e.getSalary());
        System.out.println("Employee designation : " + e.getEmpDesignation());
        System.out.println("Employee gender is : " + e.getGender());
        System.out.println();
    }
	
}
}
    
class Employee{
	private String empName;
	private double salary;
	private String empDesignation;
	private char gender;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
        
        Company c = new Company();
        
        while (!flag) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter the above option : ");
            System.out.println();

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    c.addEmployee(new Employee());
                    c.e.setEmpName("Rajan");
                    c.e.setSalary(50000.0);
                    c.e.setEmpDesignation("UI-UX Designer");
                    c.e.setGender('M');
                }
                    break;
                    
                case 2: {
                    c.removeEmployee();
                    System.out.println();
                }
                    break;
                    
                case 3: {
                    c.displayDetails();
                    System.out.println();
                }
                    break;

                case 4: {
                    flag = true;
                }
                    break;

                default: {
                    System.err.println("Invalid input");
                }
            }
        }
        System.err.println("Thank's for your patience, visit again !!");
    }
}
