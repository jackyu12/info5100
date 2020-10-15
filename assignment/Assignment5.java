package hello;
import java.util.*;
//ruweiyu
abstract class DessertItem{
	protected String name;
	public DessertItem() {
		
	}
	public DessertItem(String name) {
		this.name=name;
	}
	public final String getName() {
		return name;
	}
	public abstract int getCost();
}
class DessertShop{
	private double taxR;
	private String name;
	private int maxSize;
	private int width;
	public DessertShop() {
		
	}
	public DessertShop(double taxR,String name,int maxSize,int width) {
		this.taxR=taxR;
		this.name=name;
		this.maxSize=maxSize;
		this.width=width;
	}
	public double getTax() {
		return taxR;
	}
	public String getName() {
		return name;
	}
	
	public String centsToString(int x) {
		StringBuilder y=new StringBuilder();
		String z=String.valueOf(x);
		
		for(int i=0;i<z.length();i++) {
			if(i==z.length()-2) {
				y.append(".");
			}
			y.append(z.charAt(i));
			
		}
		return y.toString();
	}
}
class Candy extends DessertItem{
	private double weight;
	private double priceper;
	public Candy() {
		super();
	}
	public Candy(String name,double weight,double priceper) {
		super(name);
		this.weight=weight;
		this.priceper=priceper;
	}
	public int getCost() {
		double x= weight*priceper;
		return (int)x;
	}
}
class Cookie extends DessertItem{
	private int number;
	private int price;
	public Cookie(){
		super();
	}
	public Cookie(String name,int number,int price){
		super(name);
		this.number=number;
		this.price=price;
	}
	public int getCost() {
		double x= price/12;
		x=x*number;
		return (int)x;
	}
}
class IceCream extends DessertItem{
	private int cost;
	public IceCream() {
		super();
	}
	public IceCream(String name,int cost) {
		super(name);
		this.cost=cost;
	}
	public int getCost() {
		
		return cost;
	}
}
class Sundae extends IceCream{
	private int top;
	private String name;
	public Sundae() {
		
	}
	public Sundae(String name1,int cost,String name2,int top) {
		super(name2+" with "+name1,cost);
		this.top=top;
		this.name=name2;
	}
	public int getCost() {
		return super.getCost()+top;
	}
	
}
class Checkout{
	private List<DessertItem> li=new ArrayList<>();
	public Checkout() {
		List<DessertItem> li2=new ArrayList<>();
	}
	public int number() {
		return li.size();
	}
	public void enter(DessertItem x) {
		li.add(x);
	}
	public void clear() {
		li.clear();
	}
	public int totalCost() {
		int count=0;
		for(int i=0;i<li.size();i++) {
			count+=li.get(i).getCost();
		}
		return count;
	}
	public int tax(DessertShop x) {
		double temp=totalCost()*x.getTax();
		return(int)temp;
		
	}
	public String toString(DessertShop x) {
		StringBuilder sb=new StringBuilder();
		sb.append(x.getName()+"\n");
		for(int i=0;i<li.size();i++) {
			sb.append(li.get(i).getName()+ ":" +x.centsToString(li.get(i).getCost())+"\n");
		}
		
		sb.append("Tax"+ ":" +x.centsToString(tax(x))+"\n");
		sb.append("Total cost"+ ":" +x.centsToString((totalCost()+tax(x)))+"\n");
		return sb.toString();
		
		
		
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Checkout checkout = new Checkout();
		 checkout.enter(new Candy("Peanut Butter Fudge", 2.25, 399));
	     checkout.enter(new IceCream("Vanilla Ice Cream", 105));
	     checkout.enter(new Sundae("Choc. Chip Ice Cream", 145, "HotFudge", 50));
	     checkout.enter(new Cookie("Oatmeal Raisin Cookies", 4, 399));
	     DessertShop x=new DessertShop(0.2,"jack",1,1);
	     System.out.println(checkout.toString(x));
	     
	}

}
