package JavaConcepts;

import java.util.Scanner;

public class ConstructorDemo {
	private int mark1,mark2,mark3,mark4;
	private int total;
	
	void display()
		{

		System.out.println("All the students are passed!");
		System.out.println("The average marks of the students is:" + (total/4));
	}
	
	ConstructorDemo(int a,int b, int c,int d)
	
	{
		mark1=a;
		mark2=b;
		mark3=c;
		mark4=d;
	total = mark1+mark2+mark3+mark4;
	System.out.println("de total marks is :" +total);
	}
	
	ConstructorDemo(ConstructorDemo c)
	{
		System.out.println("It is a copy constructor!!");
	}
	
	

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the details..\n");
			String name=scanner.nextLine();
			int age= scanner.nextInt();
			System.out.println("Name of the person is:" +name);
			System.out.println("Age of the perosn is:" +age);
		}
			ConstructorDemo d= new ConstructorDemo(60,70,80,90);
			//		ConstructorDemo d1 = new ConstructorDemo(d);
			d.display();
			//		ConstructorDemo d2=d1;
			//	System.out.println(" The copy constructor here is " +d1);
	}
	

}
