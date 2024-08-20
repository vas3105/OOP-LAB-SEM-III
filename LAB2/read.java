import java.util.Scanner;
class read
{
public static void main(String args[])
{
byte b,f;
int d,g;
System.out.println("enter the integar number");
Scanner sc = new Scanner(System.in); 
int a= sc.nextInt();
b=(byte) a;
System.out.println("int to byte is "+b);
System.out.println("enter the character");
char c=sc.next().charAt(0);
d=(int) c;
System.out.println("char to int is "+d);
System.out.println("enter a double number");
double e =sc.nextDouble();
f= (byte) e;
System.out.println("double to byte is "+f);
g= (int)e;
System.out.println("double to int is "+g);
}}
