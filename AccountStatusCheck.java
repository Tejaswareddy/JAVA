import java.util.Scanner;

class AccountStatusCheck 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account balance");
		int balance = s.nextInt();
		int min_balance = 1000;
		System.out.println("Account is flagges or not");
		Boolean Flag = s.nextBoolean();
		if(balance > min_balance){
			System.out.println("Accoutn is ACtive");
		}if else(balance <min_balance)
		{
			System.out.println("Low Balance");
		}
		if else(Flag)
		{
			System.out.println("Account is flagged");
		}else{
			System.out.println("Account is Blocked");
		}
		s.close();
	}
}
