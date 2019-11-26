class Test{
 private int data=30;
 class Inner
{
  void msg()
{
System.out.println("data is "+data);
}
 }
 
 void display(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[]){
  Test t=new Test();
  t.display();
 }
}
