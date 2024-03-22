package JavaConcepts;

import java.util.Scanner;

public class Task 
	{
	    public static void main(String args[])
	    {
	       try {
	    	    	   Scanner obj=new Scanner(System.in);
	       
	        System.out.println("Enter the number");
	        int number= obj.nextInt();
	        System.out.println("The number is:\n" +number);
	        obj.close();
	        if(number%2!=0)
	        {
	            System.out.println("Weird");
	            
	        }else if(number%2==0 || number>2 || number<5)
	        {
	            System.out.println("Not Weird");
	        }else if(number%2==0 || number>6 || number<20)
	        {
	            System.out.println("Weird");
	        }
	    else if(number%2==0|| number >20)
	    {
	        System.out.println("Not Weird");
	    }
	       }catch(Exception e)
	       {
	    	   System.out.println(e.getMessage());
	    	   }
	       }
	    }

