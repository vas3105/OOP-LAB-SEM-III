import java.util.Scanner;

class count
{
  //int c1=0;
  static int c2=0;
  void add1()
  {
   // c1++;
    c2++;
  }
void display()
{
    System.out.println("no of objects created "+c2);
}
}
public class counter {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
       count s=new count();
       count s1=new count();
       count s2=new count();
       s.add1();
       s1.add1();
       s2.add1();
       s.display();
      
    }
}
