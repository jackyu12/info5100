package hello;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
public class MinMax implements Runnable{
	
	public static void main(String[] args) throws InterruptedException {
		 long[] arr = {34,56,111,2,56,789,87645,343535};
         Long[] newarr= new Long[arr.length];
         int i = 0;
         for (long temp : arr)
             newarr[i++]=temp;
         MinMax m = new MinMax(0,arr.length,newarr);
         m.run();
         
         System.out.println(m.max);
	}
	   Long min=Long.MAX_VALUE;
	    Long max=Long.MIN_VALUE;
	    int low;
	    int high;
	    Long[] arr;

	    public  MinMax(int low, int high, Long[] arr){
	        this.low = low;
	        this.high=high;
	        this.arr = arr;

	    }
	        
	    public void run() {
	            
	        if (low-high<=2){
	            
	            List<Long> l = Arrays.asList(arr);
	            min=Collections.min(l) < min ? Collections.min(l) : min;
	            max=Collections.max(l) > max ? Collections.max(l) : max;
	        }
	        else {
	                    System.out.println(Thread.currentThread());
	            int mid = (high+low)/2;
	            MinMax left = new MinMax(low,mid,arr);
	            MinMax right = new MinMax(mid,high,arr);
	            Thread t1 = new Thread(left);
	            Thread t2 = new Thread(right);
	            t1.start();
	            t2.start();
	            Set<Thread> threadset=Thread.getAllStackTraces().keySet();
	             for (Thread t : threadset)
	                 System.out.println(t.getName());
	            try {
	                t1.join();
	                            t2.join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }   
	        }}}