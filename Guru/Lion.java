package org.animals;
 class Lion
				{
			String color;
			float weight;
			int age;

Lion()
{
}

Lion(String color,float weight,int age)
{
	this.color=color;
	this.weight=weight;
	this.age=age;


}

public boolean isVegetarian()
{
	return false;
}
public boolean canClimb()

{
 return false;

}
public void getSound()
{
	System.out.println("Roars");

}
		
}