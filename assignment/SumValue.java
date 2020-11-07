package hello;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SumValue {
	
	static void generateArray(int[] arr){
		for(int i=0;i<arr.length;i++) {
			int int_random = ThreadLocalRandom.current().nextInt();
			arr[i]=int_random;
		}
	 }
	 /*get sum of an array using 4 threads*/
	 static long sum(int[] arr){
		 for(int i=0;i<4;i++) {
			 helper temp=new helper(i*1000000,arr);
			 temp.start();
		 }
		 return arr[arr.length-1];
	 
	 }

	public static void main(String[] args) {
		int[] arr = new int[4000000];
		 generateArray(arr);
		 long sum = sum(arr);
		 System.out.println("Sum: " + sum);
		// TODO Auto-generated method stub

	}

}
class helper extends Thread{
	private int index;
	private int[] arr;
	public helper(int x,int[]arr) {
		this.index=x;
		this.arr=arr;
		
	}
	public void run() {
		for(int i=index;i<index+1000000-1;i++) {
			arr[index+1]+=arr[index];
		}
	
	}
}
