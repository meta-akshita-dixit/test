package com.metacube.employee;

import java.util.Scanner;



public class UserClass {

	public static void main(String[] args) {
		Employees e = new Employees();
		int choice = 0 ;
		String name ,id;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do {
			 
			System.out.println("1.Add Employee ");
			System.out.println("2.Retrieve a employee info by giving its  id as input ");
			System.out.println("3.Retrieve all employees info whose name matches as input name");
			System.out.println("4.Retrieve all employee ");
			System.out.println("5.Delete an employee by specifying id ");
			System.out.println("6.Exit ");
			System.out.println("enter the option");
			choice = input.nextInt();
			switch(choice){
			case 1:
				System.out.println("enter employee name and id ");
				name = input.next();
				id = input.next();
				e.addEmployee(name, id);
				break;
			case 2:
				System.out.println("enter employee id to get info ");
				id = input.next();
				e.getEmployeeById(id);
				break;
			case 3:
				System.out.println("enter employee name to get info ");
				name = input.next();
				e.getEmployeeByName(name);
				break;
			case 4:
				System.out.println("enter employee name to get info ");
				e.getAllEmployees();
				break;
			case 5:
				System.out.println("enter employee id to delete it ");
				id = input.next();
				e.delEmployeeById(id);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("enter valid option");
			}
		}while(choice < 7 && choice > 0);
		
		
	}

}
