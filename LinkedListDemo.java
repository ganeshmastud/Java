import java.util.*;
import java.util.Scanner;

/*

add(object)
addLast(object)
addFirst(object)

remove(Object)
remove(index)
removeFirst()
removeLast()


clear()
contains(object)
size()

get(index)
getFirst()
getLast()

set(index,element)
*/
public class 	LinkedListDemo {

		LinkedList <Integer>ll1=new LinkedList<Integer>();
		Scanner sc=new  Scanner(System.in);
		   int i ,num,n,loc;
void create ()
{

	System.out.println("Enter the no of nodes");
	num=sc.nextInt();
	for (i=1;i<=num;i++)
	{
			System.out.print("Enter the node at ("+i+"):");
			n=sc.nextInt();
			ll1.add(n);
	}
	  System.out.println("List is:"+ll1);
}
void atLast()
{
	
	System.out.print("Enter the node at last:");
	n=sc.nextInt();
	ll1.addLast(n);
	System.out.println("List is:"+ll1);
}
void atFirst()
{
	
	System.out.print("Enter the node at first:");
	n=sc.nextInt();
	ll1.addFirst(n);
	System.out.println("List is:"+ll1);
}
void atLocation()
{
	
	System.out.print("Enter the Location:");
	loc=sc.nextInt();
	if(loc<=num) 
	 {
		 	System.out.print("Enter the value:");
	  		n=sc.nextInt();
			ll1.add(loc,n);
	 		System.out.println("List is:"+ll1);
	 }
	 else 
	 {
			 System.out.println("Invalid location");
	 }
}

void remove1()
{
	System.out.print("Enter the Location:");
	loc=sc.nextInt();
	if(loc<=num) 
	 {
		ll1.remove(loc);
		System.out.println("List is:"+ll1);
	 }
	else
	{
		System.out.println("Invalid location");	
	}
}
void remFirst()
{
	 ll1.removeFirst();
	 System.out.println("List is:"+ll1);
}
void remLast()
{
	 ll1.removeLast();
	 System.out.println("List is:"+ll1);
}

void clear()
{
 	System.out.println("List is:"+ll1);
 	ll1.clear();
 	System.out.println("List is:"+ll1);
}

 
   public static void main(String args[]) {
   
      // create a linked list
     LinkedListDemo ll=new LinkedListDemo();
     		int ch,key;
     		do
     		{
     		System.out.println("1.create\n2.atLast\n3.atFirst\n4.atLocation\n5.remove\n6.removeFirst\n7.remLast\n8.clear\n9size\n");
     			System.out.println("Enter a number to choice");
     			ch=ll.sc.nextInt();
     			switch(ch)
     			{
     			case 1: ll.create();
     				break;
     			case 2:ll.atLast();
     				break;
     			case 3:ll.atFirst();
     				break;
     			case 4:ll.atLocation();
     				break;
     			case 5:ll.remove1();
     				break;
     			case 6:ll.remFirst();
     				break;
     			case 7:ll.remLast();
     				break;
     			case 8:ll.clear();
     				break;
     			case 9:
     				System.out.println("size is"+ll.ll1.size());
     				break;
			
     			default:System.out.println("Invalid option");
     				break;
     				
     			}
     			System.out.println("Do you wnat to continue the press=1 otherwise =0");
     			key=ll.sc.nextInt();
     		}while(key!=0);
     		
   }

}