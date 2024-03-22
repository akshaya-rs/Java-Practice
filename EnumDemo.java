package JavaConcepts;

public class EnumDemo {
enum Level
{
	LOW,
	MEDIUM,
	HIGH
}
public static void main(String args[])
{
	Level var=Level.MEDIUM;
	System.out.println(var);
	System.out.println("\n");
	for(Level var1:Level.values())
	{
		System.out.println(var1);
	}
}
}
