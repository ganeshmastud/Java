import java.util.Scanner;
public class Armstrong{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num,sum=0,count,c,temp;
System.out.println("enter the number:");
num=s.nextInt();
temp=num;
while(num!=0)
{
 c=num%10;
 num=num/10;
  sum +=c*c*c;
}
if(temp==sum)
{
System.out.println("The no is Armstrong");
}
else
{
System.out.println("The no is not  Armstrong");
}
}
}