class ContinueLabel \\here we are using label 
{
  public static void main(String arr[])
  {
    outer:for(int i=0;i<10;i++)
	{
	  for(int j=0;j<10;j++)
	    {
		   if(j>1)
		    {
			  System.out.println();
			  continue outer;
			}
		  System.out.print(" "+(i*j));
		}
    }
  System.out.println();
  }
}