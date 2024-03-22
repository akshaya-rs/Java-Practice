package JavaConcepts;
//import java.io.*;
import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a=0,b=1,c;
System.out.println("Enter the number");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
System.out.println(a);
System.out.println(b);
obj.close();
while(n>0)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
n=n-1;
}

	}

}
