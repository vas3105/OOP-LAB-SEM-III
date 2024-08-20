import java.util.Scanner;
class extra1
{
public static void main(String args[])
{
int a,b,c1,c2;
int d;
Scanner sc = new Scanner(System.in); 
System.out.println("enter the value of a");
a= sc.nextInt();
System.out.println("enter the value of b");
b= sc.nextInt();
c1=(a<<2)+(b>>2);
c2 =(a+b*100)/10;
d=a&b;
System.out.println("a is "+c1);
System.out.println("c is "+c2);
System.out.println("d is "+d);

}}
