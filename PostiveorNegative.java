import java.util.*;
public class PositiveOrNegative
{
  
  public static void main(String args[])
  {
    
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a>0)
    System.out.println(a+ " is a positive number");
else if(a<0)
System.out.println(a+" is a negative number");
 else
   System.out.println("It is zero");
   }
   }
