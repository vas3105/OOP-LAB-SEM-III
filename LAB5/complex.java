import java.util.*;
class over
{
    int real;
    int complex;
    over()
    {
        this.complex=0;
        this.real=0;
    }
    over(int r,int cx)
    {
        this.real=r;
        this.complex=cx;
    }
    void add(int integer , over co)
    {
        int realsum= integer+co.real;
        System.out.println("sum: "+realsum+" +i "+co.complex );
    }
    void add (over c1, over c2 )
    {
        int c=c1.real+c2.real;
        int imagine=c1.complex+c2.complex;
        System.out.println( "sum: "+c+" +i "+imagine );
    }
}

public class complex {
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the 1st integer");
        int i1= sc.nextInt();
        System.out.println("enter the 1st complex");
        int c1= sc.nextInt();
        System.out.println("enter the 2nd integer");
        int i2= sc.nextInt();
        System.out.println("enter the 2nd complex");
        int c2= sc.nextInt();
        over o1=new over(i1,c1);
        over o2= new over(i2,c2);
        over calci=new over();
        calci.add(5,o1);
        calci.add(o1,o2);



    }
    
}
