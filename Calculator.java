//Day 4 - Switch statement - Afternoon

import java.util.Scanner;

class Calculator
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1");
		int n1 = s.nextInt();
		System.out.println("Enter num2");
		int n2 = s.nextInt();
		System.out.println("Enter the value");
		char value = s.next().charAt(0);
		
		switch(value){
			case '+':
				System.out.println(n1+n2);
				break;
				case '-':
				System.out.println(n1-n2);
				break;
				case '*':
				System.out.println(n1*n2);
				break;
				case '/':
				System.out.println(n1/n2);
				break;
				case '%':
				System.out.println(n1%n2);
				break;
				default:
					System.out.prinln("Out of range");
		}
		s.close();
	}
}
