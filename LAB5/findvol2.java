
import java.util.Scanner;

    class Box {
        double width;
        double height;
        double depth;
       void  init(double w, double h, double d) {
       this.width = w;
       this.height = h;
        this.depth = d;
        }
        double volume()
        {
            double vol;
            vol=width*height*depth;
            return(vol);}
    }
    class findvol2{
    public static void main(String args[])
{
   double w,h,d;
   Scanner sc =new Scanner(System.in);
   Box mybox1 = new Box();
   System.out.println("enter the width");
   w= sc.nextDouble();
   System.out.println("enter the height");
   h= sc.nextDouble();
   System.out.println("enter the depth");
 d= sc.nextDouble();
 
mybox1.init(w,h,d);
    double vol= mybox1.volume();
   System.out.println("Voulme "+vol);



}
}
