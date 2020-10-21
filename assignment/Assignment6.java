package hello;
import java.util.*;
public class Assignment6 {

	public static void main(String[] args) {
		Mreview x=new Mreview("killbill",3);
		Mreview y=new Mreview("abc");
		System.out.println( x.equals(y));
		x.addRating(5);
		x.addRating(6);
		System.out.println(x.toString());
		System.out.println(x.aveRating());
		// TODO Auto-generated method stub

	}

}
class Mreview{
	private String title;
	private List<Integer> rating;
	public Mreview() {
		this.title="";
		this.rating=new ArrayList<Integer>();
	}
	public Mreview(String title) {
		this.title=title;
		this.rating=new ArrayList<Integer>();
	}
	public Mreview(String title,int firstR) {
		this.title=title;
		this.rating=new ArrayList<Integer>();
		rating.add(firstR);
	}
	public void addRating(int r) {
		rating.add(r);
	}
	public double aveRating() {
		double count=0;
		for(int i=0;i<rating.size();i++) {
			count+=rating.get(i);
		}
		return count/rating.size();
	}
	public int compareTo(Mreview x) {
		int l1=title.length();
		int l2=x.title.length();
		int l3=Math.min(l1, l2);
		for(int i=0;i<l3;i++) {
			int w=(int)title.charAt(i);
			int z=(int)x.title.charAt(i);
			if(w>z) {
				return w-z;
			}else if(w<z) {
				return w-z;
			}
		}
		return 0;
	}
	public boolean equals(Object x) {
		Mreview y=(Mreview)x;
		if(title.equals(y.getTi())) {
			return true;
		}else {
			return false;
		}
		
	}
	public String getTi() {
		return this.title;
	}
	public int numRatings() {
		return rating.size();
	}
	public String toString() {
		return title+" average "+ String.valueOf(aveRating())+ " out of "+String.valueOf(numRatings())+" ratings, where "+title+" is the tile "+String.valueOf(aveRating())+" is the average rating "+ String.valueOf(numRatings())+" is the number of ratings";                                            
	
	}
}
