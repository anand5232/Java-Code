class Breakloop 
{  
   
   public static void main(String arr[])
    {
	   here: for(int i=0;i<100;i++)
	     {
		   if(i==10)break here;  // terminate the loop if i is 10
		   System.out.println("i:"+i);
		 }
		System.out.println(" Loop Complete ");
		
	}
}
		   