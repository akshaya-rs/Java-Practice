package JavaConcepts;
class Test
{
int a=2,b=4,c;
public int add()
{
	c=a+b;
	return c;
}
public int add(int x,int y)
{
	a=x;b=y;
	c=a+b;
	return c;
}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test obj=new Test();
int res=obj.add();
int res1=obj.add(2,3);
System.out.println("The result is : "+res);
System.out.println("The value is :" +res1);
	}

}
