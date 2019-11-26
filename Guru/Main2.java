import java.util.*;
public class Main2
{
public static void main(String args[])
{
int oddsum=0, evensum=0;
int roll, temp;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the Number:");
roll=scanner.nextInt();
while(roll!=0)
{
temp=roll%10;
if(temp%2==0)
evensum=evensum+temp;
else
oddsum=oddsum+temp;
roll=roll/10;
if(evensum==oddsum)
System.out.println("yes");
else
System.out.println("no");
}
}
}