import java.util.Scanner;
import java.util.ArrayList;
interface Ecommerce
{
    void buyitem(String name,String itemname,int count);
}
class item
{
    ArrayList<String> items;
    ArrayList<Integer> quantity;
    item()
    {
       items=new ArrayList<>();
       quantity=new ArrayList<>();
    }
    void additem(int count,String itemname)
    {
       items.add(itemname);
       quantity.add(count);
    }
}
class Amazon implements Ecommerce
{
    ArrayList<String> items;
    ArrayList<Integer> quantity;
    Amazon(ArrayList<String> items, ArrayList<Integer> quantity)
    {
     this.items=items;
     this.quantity=quantity;
    }
    public void buyitem(String name,String itemname,int count)
    {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (itemname.equals(items.get(i))) {
                found = true;
                if (quantity.get(i) >= count) {
                    System.out.println(name + "\t: " + itemname + "\t:" + count);
                    quantity.set(i, quantity.get(i) - count); // Update quantity
                    break;
                } else {
                    System.out.println("Not enough stock available");
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }
    
    void display()
    {   System.out.println("Items\t quantity");
        for(int i=0;i<items.size();i++)
        {
            System.out.println(items.get(i) + "\t" + quantity.get(i));
        }
    }
}

class demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=1;
        ArrayList<String> items = new ArrayList<>();
        items.add("apple");
        items.add("desk");
        items.add("bottle");
        ArrayList<Integer> quantity=new ArrayList<>();
        quantity.add(3);
        quantity.add(6);
        quantity.add(7);
        Amazon a=new Amazon(items, quantity);
        item i=new item();
        System.out.println("enter your choice");
        while (ch<4) {
            System.out.println("1.buy 2.display 3.add");
            ch=sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:System.out.println("enter your name");
                String name=sc.nextLine();
                
                System.out.println("enter itemname");
                String itemname=sc.nextLine();
                
                System.out.println("enter quantity");
                int q=sc.nextInt();
                a.buyitem(name, itemname, q);
                    
                    break;
            case 2: a.display();
                    break;
            case 3:   System.out.println("enter itemname");
             itemname=sc.nextLine();
           
            System.out.println("enter quantuty");
             q=sc.nextInt();
            i.additem(q, itemname); 
            a.items.add(itemname);
            a.quantity.add(q);
            break;      
                default: System.out.println("exiting..");
                    break;
            }
        }
        
        
    }
}
    
