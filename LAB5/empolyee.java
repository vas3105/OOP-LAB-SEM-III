import java.util.Scanner;

class empl
{
    char name,city;
    double salary,da,hr;
    void init(char n,char c,double s,double house,double daily)
    {
        name=n;
        salary=s;
        city=c;
        hr=house;
        da=daily;
    }
    void getdata()
    {
      Scanner  sc =new Scanner(System.in);
      System.out.println("enter the name");
       name=sc.next().charAt(0);
      System.out.println("enter the salary");
       salary=sc.nextDouble();
      System.out.println("enter the dear allowance in %");
       da=sc.nextDouble();
      System.out.println("enter the houserent in %");
       hr=sc.nextDouble();


    }
    void total()
    {   double total;
        total=salary+salary*da/100+salary*hr/100;
        System.out.println("the total is"+total);
    }
}
public class empolyee {
    public static void main(String args[])
    {
        empl empl1=new empl();
        //empl1.init();
        empl1.getdata();
        empl1.total();
    }
  
}
