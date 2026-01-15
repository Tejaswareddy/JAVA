import java.util.Scanner;

class OddAlphabet 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting Alphabet");
		char start = s.next().charAt(0);
		System.out.println("Enter the Ending Alphabet");
		char end = s.next().charAt(0);
		
		for (char i = start;i<end ;i++ )
		{
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
		s.close();
	}
}
