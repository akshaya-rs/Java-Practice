package JavaConcepts;

public class PassingObj {
	int length;
	int breadth;
	int height;
	PassingObj(int l,  int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	/*void setDimensions(int l, int b, int h)
	{
		this.length=l;
		this.breadth=b;
		this.height=h;
		
	}*/
 int volume()
 {
	 return length*breadth*height;
 }
boolean isEqual(PassingObj o)
 {
	 if (length==o.length && breadth==o.breadth && height== o.height)
		 return true;
	return false;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PassingObj obj= new PassingObj(2,3,4);
//obj.setDimensions(4,5,6);
System.out.println(obj.volume());
PassingObj obj1= new PassingObj(2,3,1);
System.out.println(obj1.volume());
System.out.println(obj.isEqual(obj1));
	}

}
