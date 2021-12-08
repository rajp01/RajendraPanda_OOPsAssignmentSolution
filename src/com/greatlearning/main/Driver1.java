package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver1 {
	private static Scanner sc = new Scanner(System.in);
	// Declare a main method
	public static void main(String args[]) {
		// Take inputs from the user display the menu of all the departments - 1.Admin, 2. Hr 3. Tech, choice - department id, 
	System.out.println("Enter DepartmentName");
	String getDepartmentName = sc.next();
	System.out.println("Enter TodaysWork");
	String getTodaysWork = sc.next();
	System.out.println("Enter WorkDeadline");
	String getWorkDeadline = sc.next();
	System.out.println("Enter IsTodayAHoliday");
	String isTodayAHoliday = sc.next();
	
	System.out.println("Choose your Department");
	System.out.println("1.Super Department");
	System.out.println("2.Admin Department");
	System.out.println("3.Hr Department");
	System.out.println("4.Tech Department");
	
	int choice = sc.nextInt();
	SuperDepartment dept;
	// switch case and create an object of department passing the departmentName, "tech", "adm" ,"hr"
		switch(choice) {
			case 1:
				// create an object
				dept = new SuperDepartment("Welcome to", "dept.departmentName \n", "dept.getTodaysWork \n", "dept.getWorkDeadline \n");
				break;
			case 2:
				// create an object
				dept = new SuperDepartment("Welcome to Hr Department\n","team Lunch\n","Fill today's timesheet and mark your attendance\n Complete by EOD\n","Today is not a Holiday\n");
				break;
			case 3:
				// create an object
				dept = new SuperDepartment("Welcome to Tech Department\n","Complete coding of Module 1\n","Complete by EOD\n Core Java \n","Today is not a Holiday\n");
				break;
			default:
				System.out.println("Wrong Choice");
				return;
			}
		// Call methods from CredentialService class
		CredentialService cs = new CredentialService();
		
		cs.showCredentials(dept);
		System.out.println("Department name:"+ getDepartmentName);
	}
		

}
