package comparatorTest;

import java.util.Comparator;



public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int salary;
	private int age;
	
	
	
	  public static final Comparator<Employee> AgeComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	        	if(o1.age < o2.age){
	                return -1;
	            } else {
	                return 1;
	            }
	    
	        }};
	  
	    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	        	if(o1.salary < o2.salary){
	                return -1;
	            } else {
	                return 1;
	            }
	    
	           // return o1.salary - o2.salary; // salary is also positive integer
	        }
	      
	    };
	  
	    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.name.compareTo(o2.name);
	        }
	      
	    };
	  
	   
	    
	    
	    public Employee(int id, String name, int salary, int age) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.age = age;
	        
	    }


	@Override
	    public int compareTo(Employee o) {
	        return this.id - o.id;
	    }
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	 public String toString(){
	        return "ID: "+this.id+"-- Name: "+this.name+"--Salary: "+this.salary+"--Age: "+this.age;
	    }
	
	  
	
	  }

	

	
 

