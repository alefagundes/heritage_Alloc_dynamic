package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		boolean inicial = false;
		char c, cond;
		do {
		
			if(inicial==false) {
			System.out.println("Do you wish inform a employee:");
			c = sc.next().charAt(0);
			if(c=='n') {
			System.exit(0);	
			}else {
				inicial=true;
			}
			}
				System.out.println("Outsource(y/n):");
				cond = sc.next().charAt(0);
					System.out.println("Name:");
					String name = sc.next();
					System.out.println("Hours:");
					int hours = sc.nextInt();
					System.out.println("Value Per Hour:");
					double value = sc.nextDouble();
					if(cond=='n') {
					Employee emp = new Employee(name, hours, value);
					list.add(emp);
				}else {
					System.out.println("Additional charge:");
					double charger = sc.nextDouble();
					Employee emp = new OutsourcedEmployee(name, hours, value, charger);
					list.add(emp);
				}
				System.out.println("Do you wish inform another Employee:");
				c = sc.next().charAt(0);
				
		}while(c!='n');
		System.out.println(list.toString());
		}

	}
	

