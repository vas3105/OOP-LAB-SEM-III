import java.util.Scanner; 
class leapyear
{
public static void main(String args[])
{
System.out.println("enter the year");
Scanner sc = new Scanner(System.in); 
int y= sc.nextInt();
if(y%4!=0)
{
System.out.println("Its not a leap year");
}
else if (y%100!=0)
{
System.out.println("It is a leap year");
}
else if (y%400!=0)
{
System.out.println("Its not a leap year");
}
else 
{
System.out.println("It is a leap year");
}
}}
