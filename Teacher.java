import java.util.Scanner;
class Student
{
	int id;
	String name;
	float marks;
	String maths;
        String science;
	String english;
        int marks1;
        int marks2;
         int marks3;	 
        Student(int x,String y,float z)
	{
	   this.id=x;
 	   this.name=y;
	   this.marks=z;
	}	
       Student()
	{
	 System.out.println("Student List");
	}
        Student(String p,String q,String r,int a,int b,int c) 
       {
         System.out.println("maths:");
	 System.out.println("science:");
	 System.out.println("english:");
	 System.out.println();
            
       }
             

void display()
{
System.out.println(id+""+name+""+marks);
}
}
class Teacher //extends Student
{     	
public static void main(String args[])
{   
    Scanner sc=new Scanner(System.in);
   Student s=new Student();
   Student s1=new Student(01,"abc",78);
   Student s2=new Student(02,"pqr",80);		
   Student s3=new Student(03,"xyz",90);
    
   s1.display();
   s2.display();
   s3.display();
   System.out.println("Enter the id no:");
   sc.nextInt();
   System.out.println("Enter the Student name:");
   sc.next();
   System.out.println("Enter the marks for maths:");
   sc.nextInt();
   System.out.println("Enter the marks for science:");
   sc.nextInt();
   System.out.println("Enter the marks for english:");
   sc.nextInt();
}

}
