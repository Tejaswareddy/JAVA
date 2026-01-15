import java.util.Scanner;

class QuoteintWithoutDivison
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting Alphabet");
		int dividend = s.nextInt();
		System.out.println("Enter the Ending Alphabet");
		int divisor = s.nextInt();
		int quotient = 0;
		
		if(divisor != 0 && dividend >= divisor){
			dividend = dividend - divisor;
			quotient++;
			System.out.println(quotient);
		}
		s.close();
	}
}
