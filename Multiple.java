class Multiple
{
  public static void main(String arr[])
    {
	   for(int i=0;i<50;i++)
	   {
		 if(i%3==0)
		 {
			 System.out.println("fizz");
		 }
		 else if(i%5==0)
		 { 
			 System.out.println("buzz");
		 }
		 else 
			 System.out.println(i);
		}
	}
}