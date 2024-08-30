

import java.util.Scanner; 
class banks
{
 double balance;
 double time;

 void init()
 {
    this.balance=0.0;
    this.time=0.0;
 }
 void init(double bal, double t)
 {
    this.balance=bal;
    this.time=t;
 }
 void getRateOfIntrest()
 {
    balance=balance+time*balance*0.02;
 }
}
class SBI extends banks
{
    void getRateOfIntrest(double balance,double time)
    {
        balance=balance+time*balance*0.08;
        System.out.println("the balance in SBI: "+balance);
    }
}
class ICICI extends banks
{
    void getRateOfIntrest(double balance,double time)
    {
        balance=balance+time*balance*0.07;
        System.out.println("the balance in ICICI: "+balance);
    }
}
class AXIS extends banks
{
    void getRateOfIntrest(double balance,double time)
    {
        balance=balance+time*balance*0.09;
        System.out.println("the balance in AXIS: "+balance);
    }
}
public class intrest{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the initial balance");
        double bal= sc.nextDouble();
        System.out.println("enter the time period in years");
        double tim=sc.nextDouble();
        banks ba = new banks();
        ba.init(bal,tim);
        
        SBI S =new SBI();
        ICICI I= new ICICI();
        AXIS A=new AXIS();
        S.getRateOfIntrest(bal,tim);
        I.getRateOfIntrest(bal,tim);
        A.getRateOfIntrest(bal,tim);
        


    }
}
