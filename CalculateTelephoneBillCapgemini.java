import java.util.Scanner;

class CalculateTelephoneBillCapgemini 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of calls");
		int calls = s.nextInt();
		int costOfHundreadCalls = 200;
		double amount;
		double amount1;
		if (calls >=0 && calls<=100){
			System.out.println("The amount to be paid" + calls * 2);
		}else if(calls >100 && calls<=150){
			int calls1 = 100 - calls;
			 amount = calls1 *0.6;
			System.out.println("The amount to be paid" + (200+amount));
		}else if(calls >150 && calls<=2000){
			int calls1 = 150 - calls;
			 amount1 = calls1 *0.5;
			System.out.println("The amount to be paid" + (200+30+amount1));
		}
		s.close();
	}
}
//for 100 calls the phone company charges 200 this means, for each call the company charges 200/100 
//that is 2 ruppees for a call.