package hello;
import java.util.*;
//Ruwei Yu


class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	this.salary=salary;
       
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
    	return name;
     
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    	this.name=name;
    	
       
    }
    public void raiseSalary(double byPercent) {
    	this.salary=salary*byPercent;
    }
}

enum Gender {
    MALE,
    FEMALE;
}
public class Assignment2 {
	  public double socialSecurityTax(Employee employee) {
		  if(employee.salary<=8900) {
			  return employee.salary*.062;
		  }
		  return 106800*.062;
	        
	    }

	    /**
	     * Write a method to calculate an employee's contribution for insurance coverage and print it.
	     * Amount of deduction is computed as follows:
	     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
	     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
	     */
	    public double insuranceCoverage(Employee employee) {
	    	if(employee.age<35) {
	    		return employee.salary*.03;
	    	}else if(employee.age<=50) {
	    		return employee.salary*.04;
	    	}else if(employee.age<60) {
	    		return employee.salary*.05;
	    	}
	    	 return employee.salary*.06;
	    	
	        
	    }

	    /**
	     * Write a method to sort three employees' salary from low to high, and then print their name in order.
	     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	     * John Alice Jenny
	     */
	    public void sortSalary(Employee e1, Employee e2, Employee e3) {
	    	if(e1.salary==e2.salary&&e2.salary==e3.salary) {
	    		System.out.println(e1.getName());
	    		System.out.println(e2.getName());
	    		System.out.println(e3.getName());
	    		return;
	    	}
	    	if(e1.salary==e2.salary) {
	    		if(e1.salary<e3.salary) {
	    			System.out.println(e1.getName());
	    			System.out.println(e2.getName());
	    			System.out.println(e3.getName());
	    		}else {
	    			System.out.println(e3.getName());
	    			System.out.println(e1.getName());
	    			System.out.println(e2.getName());
	    		}
	    		return;
	    	}else if(e1.salary==e3.salary) {
	    		if(e1.salary<e2.salary) {
	    			System.out.println(e1.getName());
	    			System.out.println(e3.getName());
	    			System.out.println(e2.getName());
	    		}else {
	    			System.out.println(e2.getName());
	    			System.out.println(e1.getName());
	    			System.out.println(e3.getName());
	    		}
	    		return;
	    	}else if(e3.salary==e2.salary) {
	    		if(e2.salary<e1.salary) {
	    			System.out.println(e2.getName());
	    			System.out.println(e3.getName());
	    			System.out.println(e1.getName());
	    		}else {
	    			System.out.println(e1.getName());
	    			System.out.println(e2.getName());
	    			System.out.println(e3.getName());
	    		}
	    		return;
	    	}
	    	double[] x=new double[3];
	    	x[0]=e1.salary;
	    	x[1]=e2.salary;
	    	x[2]=e3.salary;
	    	Arrays.sort(x);
	    	for(int i=0;i<x.length;i++) {
	    		if(e1.salary==x[i]) {
	    			System.out.println(e1.getName());
	    		}else if(e2.salary==x[i]) {
	    			System.out.println(e2.getName());
	    		}else System.out.println(e3.getName());
	    	}
	       
	    }

	    /**
	     * Write a method to raise an employee's salary to three times of his/her original salary.
	     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
	     * Do not change the input of this method.
	     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
	     */
	    public void tripleSalary(Employee employee) {
	    	employee.raiseSalary(3.0);
	       
	    }

	    //Extra credit

	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */
	    /*
	     * well, I believe we talked about this in class, the reason why it would not work is because we are working with a object reference type, when we use the swap, we are
	     * not changing the data that associated with the object originally, so it would not change the name after the swap;
	    
	    */
	    public static void main(String[] args) {
	        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
	        Employee b = new Employee("John", 30, Gender.MALE, 2500);
	     
	        System.out.println("Before: a=" + a.getName());
	        System.out.println("Before: b=" + b.getName());
	     
	        swap(a, b);
	        System.out.println("After: a=" + a.getName());
	        System.out.println("After: b=" + b.getName());
	    }

	    public static void swap(Employee x, Employee y) {
	        Employee temp = x;
	        x = y;
	        y = temp;
	    }
	}


