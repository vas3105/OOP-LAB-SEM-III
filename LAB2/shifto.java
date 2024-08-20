import java.util.Scanner;
class shifto
{
public static void main(String args[])

{
int b,c;
System.out.println("enter the number");
Scanner sc = new Scanner(System.in); 
int a= sc.nextInt();
b=a << 1;
c=a>>1;
System.out.println(a+"multiplied by 2 is"+b);
System.out.println(a+"divided by 2 is"+c);
}
}
