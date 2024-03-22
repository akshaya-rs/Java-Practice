package JavaConcepts;

public class Returnobj {
	int length, breadth, height;
	Returnobj(int l, int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	Returnobj doublebox()
	{
		Returnobj temp=new Returnobj(2*this.length,2*this.breadth,2*this.height);
		return temp;// since we storing the double values in new object, the object is returned. 
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Returnobj r1= new Returnobj(2,4,3);
System.out.println(r1.breadth + "\n" + r1.length +"\n" + r1.height);
//Returnobj r2= new Returnobj(6,7,8);
Returnobj r3= r1.doublebox();// only the references are passed and hence no new object as r3 is created here.
System.out.println(r3.breadth + "\n" + r3.length + "\n" + r3.height);
	}

}
