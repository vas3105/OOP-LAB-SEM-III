import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2,1,5,6,7};
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the element to be searched");
        int ele = sc.nextInt();
        for(int i=0;i<8;i++)
        {
            if(a[i]==ele)
            System.out.println("a[]"+i );
            /*else{
                System.out.println("element not found");
                break;
            }*/
        }


    }
}
