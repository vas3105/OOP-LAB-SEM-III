import java.util.Scanner;

public class multi {
    public static void main(String[] args)
     {
        int i,j,n,m;
        int r,c,k;
      Scanner sc= new Scanner(System.in);
      //1st array details
      System.out.println("enter the number of rows for 1st array ");
      n=sc.nextInt();
      System.out.println("enter the number of coloums for 1st array ");
      m=sc.nextInt();
      int a[][]=new int[n][m];
      System.out.println("enter the elements into the 1st array");
      for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
        {
            a[i][j]=sc.nextInt();
        }
      }
      //2nd array details
      System.out.println("enter the number of rows for 2nd array ");
      r=sc.nextInt();
      System.out.println("enter the number of coloums for 2nd array ");
      c=sc.nextInt();
      int b[][]=new int[r][c];
      System.out.println("enter the elements into the 2nd array");
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
            b[i][j]=sc.nextInt();
        }
      }
      int f[][]=new int [n][c];
      if(r==m)
      {
        for(i=0;i<n;i++)
    {
        for(j=0;j<c;j++)
        {f[i][j]=0;
            for(k=0;k<r;k++)
            {
                f[i][j]+=a[i][k]*b[k][j];
            }
        }
     } }
     else 
     {
       System.out.println("cannot be multiplied");
       System.exit(0);
     }
     System.out.println("the answer is ");
      for(i=0;i<n;i++)
      {
        for(j=0;j<c;j++)
        {
            System.out.print("\t "+f[i][j]);
        } System.out.println(" ");
      }
     
    }
}
