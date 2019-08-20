import java.util.Scanner;
public class Reverse{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
int num,digit,reverse=0;
System.out.println("Enter the numbe to reverse:");
num=s.nextInt();
while(num!=0)
{
   digit=num % 10;
   reverse= reverse * 10 + digit;
    num /= 10;
  }
System.out.println("The reverse of number is:"+reverse);

}
}