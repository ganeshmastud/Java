import java.util.*; 
import java.util.Queue; 
import java.util.Scanner;
public class QueueDemo{
	
	Scanner sc=new  Scanner(System.in);
	int i ,num,n;
	int head;
	Queue<Integer> q = new LinkedList<>(); 
void add()
{
	
	
	System.out.println("Enter the no of nodes:");
	num=sc.nextInt();
	for (i=1;i<=num;i++)
	{
			System.out.print("Enter the node at ("+i+"):");
			 n=sc.nextInt();
			q.add(n);
	}
	 System.out.println("List is:"+q);  // Display contents of the queue. 

}
void remove()
{	
	// To remove the head of queue
		int remove = q.remove(); 
		System.out.println("removed element-" + remove); 
		System.out.println("List is:"+q);
	
}
void peek()
{	// To view the head of queue 
	head = q.peek(); 
	System.out.println("head of queue-" + head); 

}
void poll()
{
	head = q.poll(); 
	System.out.println("head of queue-" + head); 
}
void size()
{
	int size = q.size(); 
	System.out.println("Size of queue-" + size); 
}

public static void main (String args[])
{

 	QueueDemo q1=new QueueDemo();
	
     		int ch,key;
     		do
     		{
     		System.out.println("1.add\n2.remove\n3.peek\n4.poll\n5.size");
     			System.out.println("Enter a number to choice");
     			ch=q1.sc.nextInt();
     			switch(ch)
     			{
     			case 1: q1.add();
     				break;
     			case 2:q1.remove();
     				break;
     			case 3:q1.peek();
     				break;
     			case 4:q1.poll();
     				break;
     			case 5:q1.size();
				break;
     			default:System.out.println("Invalid option");
     				break;
     				
     			}
     			System.out.println("Do you wnat to continue the press=1 otherwise =0");
     			key=q1.sc.nextInt();
     		}while(key!=0);
     		
   }

}	