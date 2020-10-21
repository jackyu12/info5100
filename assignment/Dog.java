package hello;

public class Dog extends Pet implements Boardable {
	private String size;
	private int sm,sd,sy,em,ed,ey;
	public Dog(String name,String ownerName,String color,String size) {
		super(name,ownerName,color);
		this.size=size;
	}
	public String getSize() {
		return this.size;
	}
	public String toString() {
		return this.getClass().getName()+"\n"+getPetName()+" owned by "+ getOwnerName()+ "\n"+"color: "+getColor()+"\n"+
				"sex: "+getSex()+"\n"+"Size: "+getSize();
	}

	@Override
	public void setStart(int month, int day, int year) {
		if(month>12||month<1||day>31||day<1||String.valueOf(year).length()>4) {
			System.out.println("errors");
			//return;
		}else {
			sm=month;
			sd=day;
			sy=year;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnd(int month, int day, int year) {
		if(month>12||month<1||day>31||day<1||String.valueOf(year).length()>4) {
			System.out.println("errors");
			//return;
		}else {
			em=month;
			ed=day;
			ey=year;
		}

		// TODO Auto-generated method stub

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		if(month>12||month<1||day>31||day<1||String.valueOf(year).length()>4) {
			System.out.println("errors");
			return false;
		
		}
		if(sy==0||em==0)return false;
		if(year>sy&&year<ey) {
			
				return true;
			}
		if(year==ey) {
				if(month<em) {
					return true;
				}else if(month==em){
					if(day<=ed)return true;
					
					}
		// TODO Auto-generated method stub
		}
		if(year==sy) {
			if(month>sm) {
				return true;
			}else if(month==sm) {
				if(day>=sd)return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Dog x=new Dog("alex","gao","green","big");
		x.setSex(2);
		System.out.println(x.toString());
		// TODO Auto-generated method stub

	}

}
