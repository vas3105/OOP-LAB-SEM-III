import java.util.Scanner;
//import java.lang.Math;
public class prime 
{
    public static void main(String args[])
    {
        int m,n,c;
        System.out.println("enter the 1st limit");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        System.out.println("enter the 2nd limit");
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {c=0;
         for(int j=2;j<= i;j++)
         { 
            if(i%j==0 )
            {
                break;
            }
            else if(i % j!=0 )
            {
                c++;
                          
            }
           
         }
         if(c==i-2)
         {
            System.out.println(" "+i);
         }
        }

    }
}

