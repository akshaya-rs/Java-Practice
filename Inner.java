package JavaConcepts;

public class Inner {
	int num;
	void InnerDisplay()
	{
		
		System.out.println("This is outer class\n");
	}
	class InnerDemo
	{
		int number;
		void InnerDemoDisp()
		{
			System.out.println("This is the inner class\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inner obj=new Inner();
obj.num=10;
System.out.println("\n" +obj.num);
obj.InnerDisplay();
Inner.InnerDemo i=obj.new InnerDemo();
i.InnerDemoDisp();
	}}
	


