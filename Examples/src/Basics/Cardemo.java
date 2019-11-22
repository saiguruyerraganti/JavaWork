package Basics;

public class Cardemo {

	
	public static void main()
	{
		Car mycar=new Car();
		System.out.println(mycar);
	}
	class Engine
	{
		public String horsePower;
		public String engineMake;
		
		Engine()
		{
			horsePower="4.2";
			engineMake="Hitachi";
			System.out.println("Engine Created,horse POwer"+horsePower);
		}
		Engine(String engineMake)
		{
			this.engineMake=engineMake;
			this.showEngine();
		}
		private void showEngine() {
			// TODO Auto-generated method stub
			
		}
	}
}
