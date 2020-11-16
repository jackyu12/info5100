package hello;

import java.util.Random;
import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
		Email x=new Email("jack","yu");
		//x.changePass();
		System.out.println(x.getInfor());
		// TODO Auto-generated method stub

	}

}
class Email{
	 	private int mailboxCapacity = 500;
	    private int defaultPasswordLength = 10;
	    private String companySuffix = "aeycompany.com";
	    private String first;
	    private String last;
	    private String pass="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	    // Constructor to receive the first name and last name
	    public Email(String firstName, String lastName) {
	    	this.first=firstName;
	    	this.last=lastName;
	    }
	    public String generateEmail() {
	    	return first+'.'+last+"@"+companySuffix;
	    }
	    public void setcap(int temp) {
	    	this.mailboxCapacity=temp;
	    }

	    // Ask for the department
	    private String SetDepartment() {
	    	Scanner scan =new Scanner(System.in);
	    	System.out.println("what is your department number:");
	    	int x=scan.nextInt();
	    	scan.close();
	    	if(x==0) {
	    		return "none";
	    	}else if(x==1) {
	    		return "sales";
	    	}else if(x==2) {
	    		return "development";
	    	}else {
	    		return "accounting";	    	
	    				}
	    	
	    }

	    // Generate a random password
	    private String randomPassword(int length) {
	    	length=defaultPasswordLength;
	    	Random ran=new Random();
	    	String out="";
	    	for(int i=0;i<length;i++) {
	    		int ind=ran.nextInt(pass.length());
	    		out+=pass.charAt(ind);
	    	}
	    	return out;
	    }
	    public String changePass() {
	    	Scanner scan =new Scanner(System.in);
	    	
	    	System.out.println("what is your new password:");
	    	String out=scan.next();
	    	if(out.length()!=defaultPasswordLength) {
	    		System.out.println("please enter a password with a length"+defaultPasswordLength);
	    		changePass();
	    	}else {
	    		scan.close();
	    	}
	    	//scan.close();
	    	//System.out.println("your new password:"+out);
	    	return out;
	    }
	    public String getInfor() {
	    	String temp = "New worker: "+first+" "+last+" Department codes:"
	    			+ "\n1 for sales"+"\n2 for development"+"\n3 for accounting"+"\n0 for none"+
	    			"\nEnter deparment code:"+sca()+"\n"+getMORE();
	    	return temp;
	    	
	    }
	    public String getMORE() {
	    	String y="Name:"+first+" "+last+"\ndepartment:"+ SetDepartment()+"\ncompany email:"+ generateEmail()+
	    			"\npassword:"+randomPassword(defaultPasswordLength)+"\nmailbox cap:"+ mailboxCapacity;
	    	return y;
	    }
	    private int sca() {
	    	Scanner scan =new Scanner(System.in);
	    	System.out.println("enter department code:");
	    	int x=scan.nextInt();
	    	return x;
	    }
}
