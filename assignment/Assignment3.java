package hello;

public class Assignment3 {
	   
		   public static void main(String[] args) {
		    	Student a=new Student("jack",1234);
				Course b =new Course("calulus");
				b.regi(a);
				System.out.println(b.getNum());
				Student c=new Student("alex",3234);
				b.regi(c);
			

		    
		

	    }

}


class Student{
	private String name;
	private int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}
class Course{
	private String name;
	private int number;
	private Student[] re = new Student[10];
	public Course(String name) {
		this.name=name;
		
	}
	public Student[] getStudent() {
		return re;
	}
	public boolean isFull() {
		if(number==2)return true;
		return false;
	}
	public String getCourse() {
		return name;
	}
	public int getNum() {
		return number;
	}
	public void regi(Student x) {
		for(int i=0;i<re.length;i++) {
			if(re[i]==null) {
				re[i]=x;
				number++;
				return;
			}
		}
		
	}
}
