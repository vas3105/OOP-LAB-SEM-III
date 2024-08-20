
class display_no
{
public static void main(String args[])
{
int a [] = {5,6,-1,-9,66,12,-7,0,2,-10};
int i,pos=0,neg=0,zero=0;
for(i=0;i<10;i++)
{  
if(a[i]>0)
{ pos++;}
if(a[i]==0)
{ zero++;
}
if(a[i]<0)
{neg++;}
}
System.out.println("positive numbers are ="+pos);
System.out.println("negative numbers are ="+neg);
System.out.println(" number of zeros are ="+zero);
}
}
