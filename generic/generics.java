import java.util.*;
class test<T>
{
void swap(T[] obj1,int pos1,int pos2)
{
    if (pos1 < 0 || pos1 >= obj1.length || pos2 < 0 || pos2 >= obj1.length) {
        System.out.println("Invalid indices");
        return;
    }

    // Perform the swap using a temporary variable
    T temp = obj1[pos1];
    obj1[pos1] = obj1[pos2];
    obj1[pos2] = temp;
}
void display(T[] obj1)
{
    for(T i: obj1)
    {
        System.out.println(i+"\t");
    }
}
}
public class generics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of the array");
        int limit = sc.nextInt();
        System.out.println("enter the array elements");
        Integer [] arr=new Integer[limit];
        for(int i=0;i<limit;i++)
        {
            arr[i]=sc.nextInt();
        }
        test t1=new test<>();
        System.out.println("enter the 1st position to swap elements");
        int pos1=sc.nextInt();
        System.err.println("enter the second postion to swap");
        int pos2=sc.nextInt();
        t1.swap(arr,pos1-1, pos2-1);
        System.out.println("after swapping the array");
        t1.display(arr);
    }
}
