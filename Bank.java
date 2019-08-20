import java.util.Scanner;
public class Bank
{
   String customeName,address;
   long accountNo,contactNo;
   int bal,intial_amt=0;
Scanner s=new Scanner(System.in);
 void createAccount()
{
      
        Bank b=new Bank();
       System.out.println("Enter the customer name:");
       customeName=s.nextLine();
       System.out.println("Enter the  Account number:");
       accountNo=s.nextLong();
       System.out.println("Enter the contact number:");
       contactNo=s.nextLong();
       System.out.println("Enter your Address:");        
	address=s.nextLine();
       System.out.println("customer name is:"+b.customeName);
       System.out.println("Your Account number is:"+b.accountNo);
       System.out.println("Your contact number is:"+b.contactNo);
       System.out.println("Your Address is:"+b.address);  
}
void deposite()
{
    System.out.println("please enter your acc_no to deposite:");  
     accountNo=s.nextLong();
    System.out.println("Enter amount to deposite:"); 
    bal=s.nextInt(); 
    bal=intial_amt+bal;
}




     public static void main (String args[])
     {
       
       Bank b=new Bank();
       b.createAccount();
       //System.out.println("customer name is:"+a1.customeName);
     //  System.out.println("Your Account number is:"+a1.accountNo);
       //System.out.println("Your contact number is:"+a1.contactNo);
      // System.out.println("Your Address is:"+a1.address);  

}
 }
