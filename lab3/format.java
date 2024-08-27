import java.util.Scanner;
public class format {
    public static void main(String args[])
    {
        int m,i,j;
Scanner sc= new Scanner (System.in);
System.out.println("enter the number of rows");
m=sc.nextInt();
int c=0;
for( i=0;i<=m;i++)
{ 
for(j=0;j<i;j++)
{c++;
System.out.print(" "+(c));
}
System.out.println(" ");
}
    }
}
