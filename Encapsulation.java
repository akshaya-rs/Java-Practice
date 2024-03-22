package JavaConcepts;

class Demo{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int a){
		this.age=a;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String s)
	{
		this.name=s;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo obj=new Demo();
obj.setAge(20);
obj.setName("Geeta");
System.out.println("Name :" +obj.getName());
System.out.println("Age:" +obj.getAge());
	}

}
