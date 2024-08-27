import java.util.Scanner;
import java.lang.Math;
 class armstrong {
    public static void main(String args[])
    {
      int n;
      double sum=0;
      Scanner sc= new Scanner (System.in);
      System.out.println("enter the number");
      n= sc.nextInt();
     int  num=n;
      do
      {
        int rem=n%10;
        sum=Math.pow(rem ,3) + sum;
        n=n/10;
      }while(n>0);
     if(sum==num)
     {
        System.out.println("It is an armstrong number");
     }
     else
     System.out.println("It's not an armstrong number");
    }
}
