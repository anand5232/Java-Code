class Continue
{
  public static void main(String arr[])
    {
	   for(int i=0;i<10;i++)
	   {
	     for(int j=0;j<10;j++)
		   {
		      if(j%2==0)continue;
			  System.out.println("i = "+i+"j = "+j);
			}
		  System.out.println(" outer loop "+i);
        }
	}
 }		
		
			  