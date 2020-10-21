package hello;

public class Pet {
	private String name, owner,color;
	protected int sex;
	public static final String M ="MALE",F="FEMALE",S="SPAYED",N="NEUTERED";
	Pet(String name,String owner,String color){
		this.name=name;
		this.owner=owner;
		this.color=color;
	}
	public String getPetName() {
		return this.name;
	}
	public String getOwnerName() {
		return this.owner;
	}
	public String getColor() {
		return this.color;
	}
	public void setSex(int x) {
		this.sex=x;
	}
	public String getSex() {
		if(sex==1) {
			return M;
		}else if(sex==2) {
			return F;
		}else if(sex==3) {
			return S;
		}else if(sex==4) {
			return N;
			
		}else 
			return "error! please enter a number from 1 to 4!";
	}
	public String toString() {
		return this.getPetName()+" owned by "+ getOwnerName()+ "\n"+"color: "+getColor()+"\n"+
	"sex: "+getSex();
	}
	public static void main(String[] args) {
		Pet x=new Pet("alex","gao","red");
		x.setSex(3);
		System.out.println(x.toString());
		// TODO Auto-generated method stub

	}

}
