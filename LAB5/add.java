import java.util.Scanner;
class time
{
    int hour,sec;
    int minute;
    time(int h,int m, int s)
    {
        hour=h;
        minute=m;
        sec=s;
    }
    time()
    {
        hour=0;
        minute=0;
        sec=0;
    }
    void display()
    {
       System.out.println(hour+" :"+minute+":"+sec);
    }
    void addtime(time t1, time t2)
    {
      int sf= (t1.sec +t2.sec)%60;
      int mf= (t1.minute+t2.minute)%60 + (t1.sec +t2.sec)/60;
      int hr= (t1.hour+t2.hour)%60 + (t1.minute+t2.minute)/60;
      System.out.println("the answer is");
      System.out.println(hr+" :"+mf +":"+sf);
    }

}
public class add {
    public static void main(String args[])
    {   
        Scanner  sc =new Scanner(System.in);
        System.out.println("1 enter hour");
        int h= sc.nextInt();
        System.out.println("1 enter minute");
        int m= sc.nextInt();
        System.out.println("1 enter second");
        int s= sc.nextInt();
        System.out.println("2 enter hour");
        int h1= sc.nextInt();
        System.out.println("2 enter minute");
        int m1= sc.nextInt();
        System.out.println("2 enter second");
        int s1= sc.nextInt();
       
        time t1=new time(h,m,s);
        t1.display();
        time t2=new time(h1,m1,s1);
        t2.display();
        time t3=new time();
        t3.addtime(t1,t2);

    }
}
