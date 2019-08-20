import java.util.*;

class ArrayL{

	int num,i,n;
	ArrayList<Integer> arr=new ArrayList<Integer>(n);
	Scanner sc=new Scanner(System.in);
void create()
{ 
	System.out.print("Enter the num of node in array to be created:");
	num=sc.nextInt();
	for (i=1;i<=num;i++)
	{
		System.out.print("Enter the node at ("+i+"):");
		n=sc.nextInt();
		arr.add(n);
		
	}
	System.out.println(arr); 
}
void copy()
{	
	System.out.print("Copying the array list.");
 	arr.clone();
	System.out.println(arr); 
}
void remove()
{
 	System.out.print("Enter the node_loc to be remove:");
	n=sc.nextInt();
	arr.remove(n);	
	System.out.println("After removing node at loc"+arr); 	

}
void size()
{
	for(i=0;i<arr.size();i++)
	System.out.print("Array size is"+arr.get(i)+" "); 
	System.out.println();
}
void clear()
{
	System.out.println("Before clearing array"+arr); 
	arr.clear();
	System.out.println("After clearing array"+arr); 
}
public static void main (String args[]) //throws IOException 
{
	ArrayL al=new ArrayL();
	al.create();
	al.copy();
	al.remove();
	al.size();
	al.clear();

}
}