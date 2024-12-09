package inheretance;

import java.util.Scanner;

public class HRManager  extends Employee{
	
	 public HRManager(String name,int id, double salary) {
	        super(name,id, salary);
	    }

	    
	    @Override
	    public void work() {
	        System.out.println(getName() + " is HR...");
	    }

	   
	    public void addEmployee(String name,int id, double salary) {
	        System.out.println("Added new employee: " + name + "Employee id"+ id +" with salary $" + salary);
	    }
	
	    public static void main(String[] args) {
	       
	        Employee employee = new Employee("Akshay",201, 50000.0);
	        employee.work();
	        System.out.println("Employee salary: $" + employee.getSalary());

	      
	        HRManager hrManager = new HRManager("Yamini",230, 60000.0);
	        hrManager.work();
	        System.out.println("HR Manager salary: $" + hrManager.getSalary());
	        hrManager.addEmployee("Sushma ", 250, 55000.0);
	    
	}

}
