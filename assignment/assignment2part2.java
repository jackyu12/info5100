package hello;

//name:ruwei yu
public class assignment2part2 {
	 public int maxSubArray(int[] nums) {
		 if(nums.length==0)return 0;
		 int out =Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]>out) {
				 out=nums[i];
			 }
		 }
		 for(int i=0;i<nums.length-1;i++) {
			 int temp=nums[i];
			 for(int j=i+1;j<nums.length;j++) {
				 
				temp=temp+nums[j];
				if(out<temp)out=temp;
				 
			 }
			 
		 }
		 return out;
	        //write your code here
	    }

	    public static void main(String[] args) {
	    	int []x=new int[] {-2,1,-3,4,-1,2,1,-5,4};
	    	assignment2part2 y= new assignment2part2();
	    	System.out.println(y.maxSubArray(x));
	        //write your code here
	    }

}
