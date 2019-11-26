class Samplethread extends Thread
{
public void run()
{
/*
   */
}

public static void main(String args[])  throws InterruptedException
{
 

Samplethread st=new Samplethread();
st.start();


st.sleep(500);


System.out.println("The Thread is Started");
System.out.println("The Thread is Paused");

}
}