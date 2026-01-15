import java.util.Scanner;

class ProductOfEvenAndOdd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting Alphabet");
		int start = s.nextInt();
		System.out.println("Enter the Ending Alphabet");
		int end = s.nextInt();
		int evenSum =1;
		int oddSum = 1;
		
		for (int i = start;i<end ;i++ )
		{
			if(i % 2 != 0){
				evenSum = evenSumi * i;
				System.out.println(evenSum);
				
			}else if(i%2!=0)
			{
				oddSum = oddSum * i;
				System.out.println(oddSum);
			}
		}
		System.out.println(evenSum+oddSum);
		s.close();
	}
}

