package JavaConcepts;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String args[])
	{
		ArrayList<Integer> myVariables= new ArrayList<Integer>();
		myVariables.add(20);
		myVariables.add(30);
		myVariables.add(25);
		myVariables.add(27);
		System.out.println(myVariables);
		Collections.sort(myVariables);
		for(int i:myVariables)
		{
			System.out.println(i);
		}
	}

}
