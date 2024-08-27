import java.util.Scanner;
class sumofnondiagonal
{
    public static void main(String args[])
    {
      int i,j,n,sum=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of rows");
      n=sc.nextInt();
      int a[][]=new int[n][n];
      System.out.println("enter the elements into the array for a square matrix");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
      }
      System.out.println(" the  non-diagonal elements are ");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
           if(i!=j)
           {
            System.out.println(" "+a[i][j]);
            sum=a[i][j]+sum;
           }
        }
      }
      System.out.println(" the sum of non-diagonal elements is "+sum);
    }
}
