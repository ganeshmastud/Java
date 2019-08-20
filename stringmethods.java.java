
public class Main{
String s1=new String();
String s2=new String();
void stringBuf()
{
     StringBuffer sBuffer = new StringBuffer("world");
     sBuffer.append(" String Buffer");
     System.out.println(sBuffer);//String Buffor.
}
void stringArr()
{
    char []Arr={'h','e','l','l','o','.'};
    String s1=new String(Arr);
    System.out.println(s1);//string Array.
}
void concat()
{
      String s3="ganesh";
      String s4="_mastud";
      s3.concat(s4);  
       System.out.println(s3+s4);//String Concat .
       String s5="_shivaji";
       System.out.println("ganesh"+s5+"_mastud");//concatination in middle.
      
    
}
void compre()
{  
      String s3="ganesh";
      String s4="_mastud";
      int res=s3.compareTo(s4);
      System.out.println(res);//String compare.
      int res1=s2.compareTo(s1);
      System.out.println(res1); 
}
      
void stringLength()
{
     String s2 = "live long";
     int len = s2.length();
     System.out.println("live long");
     System.out.println( "String Length is : " + len );//String length .
      
}
void charAtLoc()
{
     String s1="let life surprise you";
     char result=s1.charAt(5);
     System.out.println("Character at location 5 is="+result);//Character at location.
      
}
void booleanEquals()
{
      boolean retval;
      retval=s1.equals(s2);
      System.out.println("retrun value="+retval);//boolean equals.
      String s8="hello";
      String s7="hello";
      retval=s8.equals(s7);
      System.out.println("retrun value="+retval);
      
}
void replace()
{
String Str = new String("Cat");

      System.out.print("Return Value :" );
      System.out.println(Str.replace('C', 'R'));

      System.out.print("Return Value :" );
      System.out.println(Str.replace('R', 'F'));
}
public static void main (String args[])
{
  Main m=new Main();
  m.stringBuf();
  m.stringArr();
  m.concat();
  m.stringLength();
  m.charAtLoc();
  m.booleanEquals();
  m.compre();
  m.replace();
}
}