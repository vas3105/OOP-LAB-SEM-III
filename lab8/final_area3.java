import java.util.*;
interface  compute
{
  void findarea(int r,int a);
}
class rectangle implements compute{
    public void findarea(int a,int b)
    {
        int ans=a*b; //area of rectangle
        System.out.println("area of rectangle: "+ ans);
    }
}
class circle implements compute{
    public void findarea(int r,int b)          //using abstract class
    {
        double ans = 3.14157*r*r;  //area of circle
        System.out.println("the area of rectangle ="+ans);
    }
}
public class final_area3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //ask input
        System.out.println("enter the length of rectangle");
        int l =sc.nextInt();
        System.out.println("enter the breadth of rectangle");
        int b =sc.nextInt();
        rectangle r1 =new rectangle();   //create an object for rectangle
        r1.findarea(l,b);
        System.out.println("enter the radius of the circle");
        int radius= sc.nextInt();
        circle c1=new circle(); //create an object for circle
        c1.findarea(radius,1); //call the abstract class
        sc.close();
    }
}
