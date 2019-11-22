package Basics;

public class Car {
	private String carNumber;
	private String carModel;
	private String carName;
	private StringBuilder carOwnerName;
	private boolean keyStatus;
	
	Car()
	{
		carNumber="AP16EU0017";
		carModel="Q8";
		carName="Audi";
		carOwnerName=new StringBuilder().append("Saiguru");
		keyStatus=true;
	}
	
	@Override
	// we should have to override toString method
	public String toString()
	{
		return "Car[carNumber="+carNumber+",carModel="+carModel+",carName="+carName+",carOwnerName="+carOwnerName+",keyStatus="+keyStatus+"]";
		
	}

}
