import java.util.Scanner;
public class palindrome
{
public static void main (String args[])
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
		System.out.println(temp+"The number is palindrome.");
	}
	else
	{
		System.out.println(temp+"The number is not palindrome.");
	}
}
}