import java.util.Scanner;
public class magic 
{
    public static void main(String[] args)
{
        int i,j,n,m;
        int sumd=0,sumnd=0,row=0,col=0;
        Scanner sc= new Scanner(System.in);
    System.out.println("enter the number of rows");
    n=sc.nextInt();
    System.out.println("enter the number of coloums");
    m=sc.nextInt();
    int a[][]=new int[n][m];
    int sumr[]= new int[n];
    int sumc[]=new int[m];
    System.out.println("enter the elements into the array");
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
          a[i][j]=sc.nextInt();
      }
    }if(n==m)
    {
       
    for(i=0;i<n;i++)
    { sumr[i]=0;
      for(j=0;j<m;j++)
      {sumc[j]=0;
         if(i!=j)
         {
            sumnd+=a[i][j];
         }
         else if(i==j)
         {
            sumd+=a[i][j];
         }
         sumr[i]+= a[i][j];
         sumc[j]+=a[i][j];
      } 
    }
       for(i=0;i<m;i++)
        {
            col+=sumc[i];
        }
        
        for(j=0;j<m;j++)
        {
           row+=sumr[j];
        }//System.out.println(" "+row);
    if(sumd==sumnd)
    {
        if(row==col)
        {
            System.out.println("Its a magic square matrix");
        }
        else{
            System.out.println("not a magic square matrix");
        }
    }
    else{
        System.out.println("not a magic square matrix");
    }
    }
    else if(m!=n){
        System.out.println("not a square matrix");
    }
}
    
}
