//Day 6 -- methods
import java.util.Scanner;

class methods
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		//System.out.println("Enter");
		
		//Demo2(4);
		Demo1();//calling  statement/Calling/CAller
	}
	
	public static void Demo1(){//CAlled Method
		System.out.println("Print the Demo1");
		Demo2();
	}
	public static void Demo2(int a){//CAlled Method
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter a");
		a = s.nextInt();
		return a;
	}
	
}
