import java.util.Scanner;
public class MathsNo
{ 

long i,fact=1,num;
Scanner s=new Scanner(System.in);
void  factorial()
{
System.out.println("Enetr the not to be fact:");
num=s.nextLong();
 for(i=1;i<=num;i++)
 {
  fact=fact*i;
 }
System.out.println("The Factorial of"+num+"is:"+fact);

}
 void testprime()
{
 int i,j,num,flag=0;
 System.out.println("Enter the number to be checked it is prime or not");
 num=s.nextInt();
j=num/2;
if(num==0||num==1)
{
System.out.println("The no is not prime");
}
else{
    for(i=2;i<=j;i++)
   {

      if(num%i==0)
     {
      System.out.println(num+"The no is not prime");
flag=1;     
break;
} 
     if(flag==0)
     { 
      System.out.println(num+"The no is prime");
break;    }
   }
} 
}
public static void main(String args[])
{ 
 MathsNo m=new MathsNo();
m.factorial();
m.testprime();
}
}
  