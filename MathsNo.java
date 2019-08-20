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
	else
	{
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
		break;    
		}
 	 }
}
} 
void reverse()
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
void palindrome()
{
 
	Scanner s=new Scanner(System.in);
	int num,digit,reverse=0;
	System.out.println("Enter the number to palindrome:");
	num=s.nextInt();
	int temp=num;
	while(num!=0)
	{
 	  	digit=num % 10;
   		reverse= reverse * 10 + digit;
   	 	num /= 10;
 	 }
	if(temp==reverse)
	{
		System.out.println(temp+ "The number is palindrome.");
	}
	else
	{
		System.out.println(temp+  "The number is not palindrome.");
	}
}
void armstrong()
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

void Fibonnaci()
{
Scanner s =new Scanner(System.in);
        int n , t1 = 0, t2 = 1;
	System.out.println("Enter the number:");
	n=s.nextInt();
        System.out.print("First " + n + " terms: ");

        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
}
public static void main(String args[])
{ 
 MathsNo m=new MathsNo();
int ch,key;
Scanner s=new Scanner(System.in);
do{
System.out.println("1.factorial()");
System.out.println("2.testprime()");
System.out.println("3.reverse()");
System.out.println("4.palindrome()");
System.out.println("5.armstrong()");
System.out.println("6.Fibonnaci()");

System.out.println("Enter the choice");
ch=s.nextInt();

	
	
	 switch (ch)
	 {
 		 case 1:m.factorial();
			 break;
 		 case 2:m.testprime();
        		 break;
  		case 3:m.reverse();
         		break;
  		case 4:m.palindrome();
      		        break;
  		case 5:m.armstrong();
         		break;
                case 6:m.Fibonnaci();
                        break;
 		default: System.out.println("Invald option");
        		break;
	}
System.out.println("");
System.out.println("---------------------------------");
System.out.println("Do you want to continue then press any key but not 0:");
key=s.nextInt();

     }
      while(ch!=0);

  	
}
}


  