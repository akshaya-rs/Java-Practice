package JavaConcepts;

class Super
{
	int maxspeed=200;
	public void message()
	{
		System.out.println("This is the super class\n");
	}
	}
class Car extends Super
{
	int maxspeed=180;
	public void message()
	{
		System.out.println("This is the child class\n");
	}
	public void display()
	{
		super.message();
		
		System.out.println("The maximum speed of the car is:" +super.maxspeed);
	}
	}
public class SuperDemo { 
	public static void main(String args[])
	{
		Car obj= new Car();
		obj.display();
	}
}