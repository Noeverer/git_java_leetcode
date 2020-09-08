package runoob_java;

import java.io.*;
public class EmployeeTest{
	public static void main(String[] args) {
		 Employee empOne = new Employee("Robot1");
		 Employee empTwo = new Employee("Robot2");
		 
		 //Calling member methods of these two objects
		 empOne.empAge(26);
		 empOne.empDesignation("Senior Programmer");
		 empOne.empSalary(1000);
		 empOne.printEmploree();
		 
		 empTwo.empAge(23);
		 empTwo.empDesignation("Primary Programmer");
		 empTwo.empSalary(500);
		 empTwo.printEmploree();
	} 
	
}