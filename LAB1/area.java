class area
{
 public static void main(String args[])
{
int l,b, area,circum;
l=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);

circum=2*(l+b);
area=l*b;
 System.out.println("area of rectangle="+area);

System.out.println("circumference ="+circum);
}
}
