package JavaConcepts;
//used to convert primitive datatypes into objects
public class Wrapperclass {
	public static void main(String args[])
	{int a=5;
	double b=6.76;
	Integer obj1=Integer.valueOf(a);
	Double obj2=Double.valueOf(b);
	if (obj1 instanceof Integer)
	{
		System.out.println("the integer object is created\n");
	}
	if(obj2 instanceof Double)
	{
		System.out.println("the Double object is created\n");
		
	}
	
		Integer myInt=500;
		Double myDouble=5.99;
		Character myCh='A'; 
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myCh.charValue());
		String myString=myInt.toString();
		System.out.println(myString.length());
		
	}

}
