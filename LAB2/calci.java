import java.util.Scanner;
class calci
{
public static void main(String args[])
{
char q;
Scanner sc = new Scanner(System.in); 
do
{
System.out.println("enter the 1st number");
int a= sc.nextInt();
System.out.println("enter the operator");
char o=sc.next().charAt(0);
System.out.println("enter the 2nd number");
int b= sc.nextInt();
switch(o)
{ 
case ('+'): float d = a+b; 
        System.out.println("Answer="+d); break;
case ('-'):  d = a-b;
        System.out.println("Answer="+d);
        break;
case ('*'):   d= a*b;
         System.out.println("Answer="+d);
         break;
case ('/'): d= a/b;
         System.out.println("Answer="+d);
         break;
default : System.out.println("invalid input");
          break;
}
 System.out.println("Do another(y/n)?");
 q = sc.next().charAt(0);
}while(q=='y');
}}
