import java.util.Scanner;
import java.lang.Math;
class bool
{
    int num;
   bool()
   {
    this.num=0;
   }
   bool(int number)
   {
    this.num=number;
   }
    boolean iszero()
    {
        return this.num==0;
    }
    boolean isPositive()
    {
        return this.num>0;
    }
    boolean isnegative()
    {
        return this.num<0;
    }
    boolean isodd()
    {
        if(num%2!=0)
        {
           return true;
        }else return false;
    }
  boolean iseven()
  {
    if (num%2==0)
    {
        return true;
    }else return false;
}
boolean isprime()
{  if (this.num % 1 != 0 || this.num <= 1) 
    { 
       return false;
    }
    int n =  this.num;
    for (int i = 2; i <= Math.sqrt(n); i++)
    {
    if (n % i == 0)
    {
        return false;
    }
    }
return true;
 }

boolean isarmstrong()
{
    int  n=this.num;
    double sum=0;
      do
      {
        int  r =n%10;
        sum=Math.pow(r ,3) + sum;
        n=n/10;
      }while(n>0);
     if(sum==this.num)
     {
       return true;
     }
     else
     return false;
}
}

    
public class check {
    public static void main(String args[])
    {
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       num = sc.nextInt();
       bool b1=new bool(num);
       System.out.println("isZero: " + b1.iszero());
        System.out.println("isPositive: " + b1.isPositive());
        System.out.println("isNegative: " + b1.isnegative());
        System.out.println("isOdd: " + b1.isodd());
        System.out.println("isEven: " + b1.iseven());
        System.out.println("isPrime: " + b1.isprime());
        System.out.println("isArmstrong: " + b1.isarmstrong());
     
    }
}
