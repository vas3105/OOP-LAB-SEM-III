
import java.util.*;
interface company{  //interface

    double compute(int n);}
class hardware1 implements company{
  Scanner sc=new Scanner(System.in);
    String item;
    String manf;
    double price;
    hardware1 h[];
    hardware1()
    {} 
    hardware1(int n)
    {
       //ARRAY FOR HARDWARE
      h =new hardware1[n];
      for(int i=0;i<n;i++)  //details of hardware
      {
        h[i] = new hardware1(); 
        System.out.println("enter the item type");
        h[i].item=sc.nextLine();
        System.out.println("enter the manf");
        h[i].manf=sc.nextLine();
        System.out.println("enter the price");
        h[i].price=sc.nextDouble();
        sc.nextLine();
      }}
    public double compute(int n)   //get total sold price in hardware
    { double total1=0;
      for (int i=0; i < n ; i++)
      {
         total1+=h[i].price;
         
      }return total1;
    }
   
}
class software implements company{
    Scanner sc=new Scanner(System.in);
    String item;
    String manf;
    double price;
    software s[];  //array for software
    software()
    {}
    software(int n)
    {
      s=new software[n];
    for(int i=0; i<n; i++) //details of the array
    {
        s[i]=new software();
      System.out.println("enter the item type");
      s[i].item=sc.nextLine();
      System.out.println("enter the os");
      s[i].manf=sc.nextLine();
      System.out.println("enter the price");
      s[i].price=sc.nextDouble();
      sc.nextLine();
    }}
    public double compute(int n)  //get total sold price in software
    {
        double total2=0;
      for(int i=0;i<n;i++)
      {
         total2+=s[i].price;
         
      }return total2;
      
    }
}  
public class hardware {
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,n1;
        System.out.println("enter the number of hardware items");  //total numbe of goods
        n=sc.nextInt();
        hardware1 h=new hardware1(n); //create an object of hardware
        System.out.println("enter the number of software items ");
        n1=sc.nextInt();
        software s=new software(n1); //create an object for software
       
       double total= s.compute(n1)+h.compute(n); //find the total sales
       System.out.println("the total sales: "+total); //print the total sales
     
    }
  }
