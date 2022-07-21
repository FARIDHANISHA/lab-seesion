/*   
Author:Faridha Nisha
Title: Array weight
Question: Using array find the first half & second half weight?
*/


class A{
	public static void main (String[]name)
	{
	  int  arr []={1,2,3,4,5,6}; //declaring array
	  int mid =arr.length/2 ;
	  int sum=0;
	  int sum1=0;
	  for( int i=0;i<mid;i++)
	  {
		  sum+=arr[i];
		  
	  }
	      System.out.println(sum) ;
		  
		  
	   for( int i=mid;i<arr.length;i++)
	  {
		  sum1+=arr[i];
		  
	  }
	  
		    System.out.println(sum1) ;
       // 	  
	  if(sum1<sum)
	  {
		   System.out.println("first half is higher than"+" "+sum);
	  }
	   else
		 {
			  System.out.println("second half is higher than"+" "+sum1);
		 }
		 
	}
}





















