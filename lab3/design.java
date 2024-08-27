import java.util.Scanner;
class design
{
public static void main(String args[])
{
int m,i,j;
Scanner sc= new Scanner (System.in);
System.out.println("enter the number of rows");
m=sc.nextInt();
for( i=0;i<=m;i++)
{
for(j=0;j<i;j++)
{
System.out.print(" "+(i));
}
System.out.println(" ");
}}}
