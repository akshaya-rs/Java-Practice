package JavaConcepts;

abstract class Member {
	
	abstract void message();/*
	public void print()
	{
		System.out.println("Welcome to our page");
	}*/
}

class Student extends Member
{
	
	@Override
	void message() { 
		// TODO Auto-generated method stub
		System.out.println("Hello Student.."  );
	}}
class Teacher extends Member
{
	void message()
	{
		System.out.println("Hello Teacher..");
	
	
	}}
class AbstractDemo{
	
	public static void main(String[] args)
	{/*
		Student s1= new Student();
		Teacher t1= new Teacher();
	Member m1= new Student();
Member m2= new Teacher();//m1.print();*/
Member[] m= new Member[4];
m[0]= new Student();
m[1]=new Student();
m[2]=new Teacher();
m[3]=new Teacher();
try {
for(Member mem:m)
{
//	s1.message();//	t1.message;
		mem.message();
	}
	}
catch (NullPointerException e)
{
	System.out.println(" Error found");
}
}}
