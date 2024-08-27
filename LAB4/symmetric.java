import java.util.Scanner;
public class symmetric 
{
    public static void main(String[] args)
    {
        int i,j,n,count=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of rows for a square matrix");
      n=sc.nextInt();
      int a[][]=new int[n][n];
      System.out.println("enter the elements into the array");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
      }
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
           if(a[i][j]==a[j][i])
           {
             count++;
           }
        }
      }
      if(count==n*n)
      {
        System.out.println("Its a symmetric matrix");
      }
      else 
      System.out.println("Its not a symmetric matrix");
     
    }
}
