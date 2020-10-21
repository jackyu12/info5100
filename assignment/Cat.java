package hello;

public class Cat extends Pet implements Boardable {
	private String hairL;
	private int sm,sd,sy,em,ed,ey;
	public Cat(String name,String ownerName,String color,String hairL) {
		super(name,ownerName,color);
		this.hairL=hairL;
	}
	public String getH() {
		return this.hairL;
	}
	public String toString() {
		return this.getClass().getName()+"\n"+getPetName()+" owned by "+ getOwnerName()+ "\n"+"color: "+getColor()+"\n"+
				"sex: "+getSex()+"\n"+"Hair: "+getH();
	}
	public void setStart(int month,int day,int year) {
		if(month>12||month<1||day>31||day<1||String.valueOf(year).length()>4) {
			System.out.println("errors");
			//return;
		}else {
			sm=month;
			sd=day;
			sy=year;
		}
	}
	public void setEnd(int month,int day,int year) {
		if(month>12||month<1||day>31||day<1||String.valueOf(year).length()>4) {
			System.out.println("errors");
			//return;
		}else {
			em=month;
			ed=day;
			ey=year;
		}
		
	}
	public boolean boarding(int month,int day,int year) {
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
		Cat x=new Cat("alex","gao","blue","short");
		x.setSex(1);
		x.setEnd(1, 3, 2010);
		x.setStart(2, 3, 2001);
		System.out.println(x.toString());
		// TODO Auto-generated method stub

	}

}
