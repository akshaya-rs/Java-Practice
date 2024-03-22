package JavaConcepts;

public class Addition {
	private int a,b,c=0,d=3;
	
	public int getA()
	{
		return a;
	}
	public void setA(int x)
	{
		this.a=x;
	}
	public int getB()
	{
		return b;
	}
	public void setB(int y)
	{
		this.b=y;
	}
	public void display()
	{
		c= a+(b*d)/2;
		System.out.println(b*d);
		System.out.println("The result is " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.setA(5);
		a.setB(5);
		a.display();
		System.out.println(a.getA());
		System.out.println(a.getB());

	}

}
