 package JavaConcepts;
interface Animal
{
	public void AnimalSound();
	public void sleep();
}
class Pig implements Animal
{
	public void AnimalSound()
	{
		System.out.println("The Pig says soemthing");
	}
	public void sleep()
	{
		System.out.println("The pig is sleeping now-zzzz");
	}
}
public class InterfaceDemo {
	public static void main(String args[])
	{
		Pig obj=new Pig();
		obj.AnimalSound();
		obj.sleep();
	}

}
