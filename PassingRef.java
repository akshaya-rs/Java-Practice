package JavaConcepts;

public class PassingRef {
	
static void increment(int a)// call by value and the variables used here are called local variables.
{
	a=a+1;
}
	int length, breadth, height;

	PassingRef(int l, int b, int h)
	{
	length=l;
	breadth=b;
	height=h;
	}
boolean isEqual(PassingRef b)
{
	//length=b.length;
	b.length++;
	if(length==b.length && breadth==b.breadth && height==b.height)
		return true;
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
increment(a);
increment(a);
System.out.println(a);
PassingRef b2= new PassingRef(4,6,8);
PassingRef b3= new PassingRef(3,4,5);
// memory space is created in heap storage-dynamic allocation and it can be accessed only by references.
System.out.println(b2.isEqual(b3));// We are passing only the reference. so the length is changed for object b3.
System.out.println(b3.length);
	}

}
