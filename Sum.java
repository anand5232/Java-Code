import java.util.Scanner;
class Sum
{
   public static void main(String[] args)
   {
     int a,b,c;
     System.out.println(" enter two number ");
     Scanner in = new Scanner(System.in);
     a=in.nextInt();
     b=in.nextInt();
     c=a+b;
     System.out.println(" Sum = "+c);
   }
}
