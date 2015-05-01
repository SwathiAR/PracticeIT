package comparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeTest {
	
	
	

	public static void main(String args[]){
        Employee e1 = new Employee(1, "Seeta", 1000, 32);
        Employee e2 = new Employee(2, "Lata", 1300, 22);
        Employee e3 = new Employee(3, "Rita", 10, 42);
        Employee e4 = new Employee(4, "Geeta", 100, 23);
        Employee e5 = new Employee(5, "Nita", 1200, 26);
      
	
	List<Employee> listOfEmployees = new ArrayList<Employee>();
    listOfEmployees.add(e1);
    listOfEmployees.add(e2);
    listOfEmployees.add(e3);
    listOfEmployees.add(e4);
    listOfEmployees.add(e5);


    Collections.sort(listOfEmployees);      //Sorting by natural order
    for (Employee employee : listOfEmployees) {
		System.out.println(employee);
	}
    
System.out.println("-----------------------------------------------------------");
    
  
    Collections.sort(listOfEmployees, Employee.NameComparator);
    for (Employee employee : listOfEmployees) {
		System.out.println(employee);
	}
    System.out.println("-----------------------------------------------------------");
  
    Collections.sort(listOfEmployees, Employee.AgeComparator);
    for (Employee employee : listOfEmployees) {
		System.out.println(employee);
	}
    System.out.println("-----------------------------------------------------------");
   
  
    Collections.sort(listOfEmployees, Employee.SalaryComparator);
    
    for (Employee employee : listOfEmployees) {
		System.out.println(employee);
	}
    System.out.println("-----------------------------------------------------------");
 
  
    
    




	

	}

}

