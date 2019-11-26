public class  Mainthread  extends Thread
{

public void run()
{
System.out.println("My Thread is in Running status");
}

public static  void main(String args[])
{
Mainthread mt=new Mainthread();
mt.start();
}
}
  