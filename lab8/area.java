import java.util.*;
abstract class compute
{
  abstract void findarea();
}
 class rectangle extends compute{
 int a,b;
  rectangle(int a,int b)    //initialize the variables
 {
    this.a=a;
    this.b=b;
 }
 
 void findarea() {              //using abstract class
     int ans =a*b;
     System.out.println("the area of rectangle ="+ans);
 }
}
 class circle extends compute{
    int r;
    circle(int r)      //initialize the variables
    
    {
        this.r=r;
    }
    void findarea()          //using abstract class
    {
        double ans = 3.14157*r*r; //compute area of circle
        System.out.println("the area of circle ="+ans);
    }
}
class area
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        int l =sc.nextInt();
        System.out.println("enter the breadth of rectangle");
        int b =sc.nextInt();
        rectangle r1 =new rectangle(l,b);   //create an object for rectangle
      
        r1.findarea();
        System.out.println("enter the radius of the circle");
        int radius= sc.nextInt();
        circle c1=new circle(radius); //create an object for circle

        c1.findarea(); //call the abstract class
        sc.close();
    }
}
