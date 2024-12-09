package inheretance;

public class EmployeeP extends Person {
	  	private int employeeId;
	    private String jobTitle;

	    public EmployeeP(String firstName, String lastName, int employeeId, String jobTitle) {
	        super(firstName, lastName);
	        this.employeeId = employeeId;
	        this.jobTitle = jobTitle;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    
	    @Override
	    public String getLastName() {
	        return super.getLastName() + ", " + jobTitle;
	    
	}

	    public static void main(String[] args) {
	        
	        Person person = new Person("Akshay", "Kumar");
	        System.out.println("First Name: " + person.getFirstName());
	        System.out.println("Last Name: " + person.getLastName());

	        
	        EmployeeP employee = new EmployeeP("Akshay", "Uppala", 1234, "Software Engineer");
	        System.out.println("First Name: " + employee.getFirstName());
	        System.out.println("Last Name: " + employee.getLastName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	    }

}
