import java.util.Scanner;
public class Fibo{
 public static void main(String[] args) 
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
}
