class BreakloopWith  // here we are using the break statement
{
  public static void main(String arr[])
    {
	   outer: for (int i=0;i<3;i++)
	     {
		   System.out.print("Pass" +i+":");
		   for(int j=0;j<100;j++)
		    {
			  if(j==10)break outer;
			   System.out.print(j+" ");
			}
		   System.out.println("This is not print");
		 }
		System.out.println(" loop is completed :");
	}
}
		  
			