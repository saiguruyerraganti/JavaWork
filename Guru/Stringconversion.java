import java.util.Scanner;
public class Stringconversion
{
public static void main(String args[])
{

String s="";

Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
           s = sc.nextLine();

            System.out.println("You entered  the Integer is:" + Integer.parseInt(s));
}
catch(NumberFormatException nfe)
{
System.out.println("NumberFormatException: " + nfe.getMessage());
   }
  }
}


/*public class Stringconversion
{
  public static void main (String[] args)
  {
    
    
 
    try
    {
      
      int i = Integer.parseInt("xyz");
 
      
      System.out.println("int i = " + i);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
  }
}*/