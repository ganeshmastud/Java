import java.util.Scanner;
public class Count
         {
          public static void main(String args[])
            {
                String text;
                Scanner s=new Scanner(System.in);
                System.out.println("Please enter the string to be checke:");
                text=s.nextLine();
                int vowels=0,consonants=0,spaces=0;
                
                 
                int l=text.length();
                
                   
                for(int i=0;i<l;i++)
                 {  
                    char ch=text.charAt(i); 
                    if(ch =='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                   {
                   vowels++;
                   }
                    else if(ch==' ')
                    {
			spaces++;
		    }
                     else if(ch>='a'||ch>='z' ||ch>='A' || ch>='Z')
                      {
			 consonants++;
                       }
                  
                   
                      
                  }
            System.out.println("Number of vowels:"+vowels);
            System.out.println("Number of spaces:"+spaces);
            System.out.println("Number of consonants:"+consonants);
           }
}
