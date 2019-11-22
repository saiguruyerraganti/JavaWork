package Basics;

class President
{ 
	// static variable single_instance of type Singleton 
	private static President single_instance = null; 

	// variable of type String 
	public String s; 

	// private constructor restricted to this class itself 
	private President() 
	{ 
		s = "Hello I am a Ramnadh "; 
	} 

	// static method to create instance of Singleton class 
	public static President getInstance() 
	{ 
		if (single_instance == null) 
			single_instance = new President(); 

		return single_instance; 
	} 
} 

// Driver Class 
class Main 
{ 
	public static void main(String args[]) 
	{ 
		// instantiating Singleton class with variable x 
		President x = President.getInstance(); 

		// instantiating Singleton class with variable y 
		President y = President.getInstance(); 

		// instantiating Singleton class with variable z 
		President z = President.getInstance(); 

		// changing variable of instance x 
		x.s = (x.s).toUpperCase(); 

		System.out.println( x.s); 
		System.out.println( y.s); 
		System.out.println( z.s); 
		System.out.println("\n"); 

		// changing variable of instance z 
		z.s = (z.s).toLowerCase(); 

		System.out.println( x.s); 
		System.out.println( y.s); 
		System.out.println( z.s); 
	} 
} 